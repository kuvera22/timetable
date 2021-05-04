package com.example.service;

import com.example.domain.Department;
import com.example.domain.Speciality;
import com.example.dto.SpecialityRq;
import com.example.repository.DepartmentRepository;
import com.example.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SpecialityService {
    private final SpecialityRepository specialityRepository;
    private final DepartmentRepository departmentRepository;

    @Autowired
    public SpecialityService(SpecialityRepository specialityRepository, DepartmentRepository departmentRepository) {
        this.specialityRepository = specialityRepository;
        this.departmentRepository = departmentRepository;
    }

    public Speciality save(SpecialityRq specialityRq) {
        Department department = departmentRepository.findById(specialityRq.getDepartmentUUID()).orElseThrow(RuntimeException::new);
        Speciality speciality = new Speciality(UUID.randomUUID(), specialityRq.getName(), specialityRq.getSpecialityPlan(), department);
        return specialityRepository.save(speciality);
    }
}
