package com.example.dto;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class TimeSlotRq {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<DaySchedule> daySchedules;

    public static class DaySchedule {
        private LocalTime startTime;
        private LocalTime endTime;

        public LocalTime getStartTime() {
            return startTime;
        }

        public void setStartTime(LocalTime startTime) {
            this.startTime = startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

        public void setEndTime(LocalTime endTime) {
            this.endTime = endTime;
        }

    }

    public TimeSlotRq() {
    }

    public TimeSlotRq(LocalDateTime startTime, LocalDateTime endTime, List<DaySchedule> daySchedules) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.daySchedules = daySchedules;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<DaySchedule> getDaySchedules() {
        return daySchedules;
    }

    public void setDaySchedules(List<DaySchedule> daySchedules) {
        this.daySchedules = daySchedules;
    }
}
