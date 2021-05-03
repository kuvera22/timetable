package com.example.contorller;

import com.example.domain.StudentGroup;
import com.example.dto.StudentGroupRq;
import com.example.service.StudentGroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGroupController {
    private final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @PostMapping("studentGroup")
    public StudentGroup save(@RequestBody StudentGroupRq studentGroupRq) {
        return studentGroupService.save(studentGroupRq);
    }
}
