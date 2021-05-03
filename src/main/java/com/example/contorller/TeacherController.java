package com.example.contorller;

import com.example.domain.Teacher;
import com.example.dto.TeacherRq;
import com.example.service.TeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("teacher")
    public Teacher save(@RequestBody TeacherRq teacherRq) {
        return teacherService.save(teacherRq);
    }
}
