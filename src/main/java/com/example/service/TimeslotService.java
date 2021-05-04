package com.example.service;

import com.example.domain.Timeslot;
import com.example.dto.TimeSlotRq;
import com.example.repository.TimeslotRepository;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TimeslotService {
    private final TimeslotRepository repository;

    public TimeslotService(TimeslotRepository repository) {
        this.repository = repository;
    }

    public List<Timeslot> createTimeSlots(TimeSlotRq request) {
        LocalDateTime start = request.getStartTime();
        LocalDateTime end = request.getEndTime();
        int dayOfWeek = 1;
        while (start.equals(end)) {
            if (dayOfWeek != 7) {
                for (TimeSlotRq.DaySchedule daySchedule : request.getDaySchedules()) {
                    Timeslot timeslot = new Timeslot(UUID.randomUUID(),
                            start,
                            DayOfWeek.of(dayOfWeek),
                            daySchedule.getStartTime(),
                            daySchedule.getEndTime());
                    repository.save(timeslot);
                }
            }
            if (dayOfWeek == 7) {
                dayOfWeek = 0;
            }
            dayOfWeek++;
            start = start.plusDays(1);
        }
        return repository.findAll();
    }
}
