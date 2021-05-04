package com.example.service;

import com.example.domain.Speciality;
import com.example.domain.StudentGroup;
import com.example.dto.StudentGroupRq;
import com.example.repository.SpecialityRepository;
import com.example.repository.StudentGroupRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StudentGroupService {
    private final StudentGroupRepository studentGroupRepository;
    private final SpecialityRepository specialityRepository;

    public StudentGroupService(StudentGroupRepository studentGroupRepository, SpecialityRepository specialityRepository) {
        this.studentGroupRepository = studentGroupRepository;
        this.specialityRepository = specialityRepository;
    }

    public StudentGroup save(StudentGroupRq studentGroupRq) {
        Speciality speciality = specialityRepository.findById(studentGroupRq.getSpecialityUUID()).orElseThrow(RuntimeException::new);
        StudentGroup studentGroup = new StudentGroup(UUID.randomUUID(), studentGroupRq.getName(), studentGroupRq.getNumberOfStudents(), speciality);
        return studentGroupRepository.save(studentGroup);
    }
}
