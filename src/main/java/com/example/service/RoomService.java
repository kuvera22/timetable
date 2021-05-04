package com.example.service;

import com.example.domain.Room;
import com.example.dto.RoomRq;
import com.example.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public Room save(RoomRq roomRq) {
        Room room = new Room(UUID.randomUUID(), roomRq.getName());
        return roomRepository.save(room);
    }
}
