package com.example.contorller;

import com.example.domain.Department;
import com.example.domain.SpecialityPlan;
import com.example.domain.SubjectQuality;
import com.example.repository.DepartmentRepository;
import com.example.repository.SpecialityRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class SubjectController {
    private final SpecialityRepository specialityRepository;
    private final DepartmentRepository departmentRepository;
    //private final SubjectParser subjectParser;

    public SubjectController(SpecialityRepository specialityRepository, DepartmentRepository departmentRepository) {
        this.specialityRepository = specialityRepository;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("subject/{departmentUUID}")
    public List<SubjectQuality> get(@PathVariable String departmentUUID) {
        Department department = departmentRepository.findById(UUID.fromString(departmentUUID)).orElseThrow(RuntimeException::new);
        return specialityRepository.getAllByDepartment(department).stream()
                                                                  .flatMap(speciality -> speciality.getSpecialityPlans().stream())
                                                                  .flatMap(specialityPlan -> specialityPlan.getSubjectQuality().stream())
                                                                  .filter(subjectQuality -> subjectQuality.getDepartmentUUID().equals(department.getId()))
                                                                  .collect(Collectors.toList());
    }

//    @GetMapping("parse")
//    public List<SpecialityPlan> parse() {
//        return subjectParser.parse(5);
//    }
}
