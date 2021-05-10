package com.example.contorller;

import com.example.domain.Department;
import com.example.domain.SubjectQuality;
import com.example.repository.DepartmentRepository;
import com.example.repository.SpecialityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class SubjectController {
    private final SpecialityRepository specialityRepository;
    private final DepartmentRepository departmentRepository;

    public SubjectController(SpecialityRepository specialityRepository, DepartmentRepository departmentRepository) {
        this.specialityRepository = specialityRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("subject/{departmentUUID}")
    public List<SubjectQuality> get(@PathVariable String departmentUUID) {
        Department department = departmentRepository.findById(UUID.fromString(departmentUUID)).orElseThrow(RuntimeException::new);
        return specialityRepository.getAllByDepartment(department).stream()
                                                                  .map(speciality -> speciality.getSpecialityPlan().getSubjectQuality())
                                                                  .flatMap(Collection::stream)
                                                                  .filter(subjectQuality -> subjectQuality.getDepartmentUUID().equals(department.getId()))
                                                                  .collect(Collectors.toList());
    }
}
