package com.example.service;

import com.example.domain.Department;
import com.example.domain.Teacher;
import com.example.dto.TeacherRq;
import com.example.repository.DepartmentRepository;
import com.example.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final DepartmentRepository departmentRepository;

    public TeacherService(TeacherRepository teacherRepository, DepartmentRepository departmentRepository) {
        this.teacherRepository = teacherRepository;
        this.departmentRepository = departmentRepository;
    }

    public Teacher save(TeacherRq teacherRq) {
        Department department = departmentRepository.findById(teacherRq.getDepartmentUUID()).orElseThrow(RuntimeException::new);
        Teacher teacher = new Teacher(UUID.randomUUID(), teacherRq.getFirstName(), teacherRq.getLastName(), teacherRq.getSubjectQuality(), department);
        return teacherRepository.save(teacher);
    }
}
