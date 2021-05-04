package com.example.contorller;

import com.example.domain.Room;
import com.example.dto.RoomRq;
import com.example.service.RoomService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
    private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("room")
    public Room save(@RequestBody RoomRq roomRq) {
        return roomService.save(roomRq);
    }
}
