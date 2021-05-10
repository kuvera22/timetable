package com.example.contorller;

import com.example.domain.Department;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class DepartmentController {

    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("department")
    public String get() {
        return "department";
    }

    @PostMapping("department")
    public String save(@RequestParam String name, @RequestParam List<String> subjectName) {
        Department department = new Department(UUID.randomUUID(), name);
        departmentService.save(department);
        return "redirect:/department";
    }
}
