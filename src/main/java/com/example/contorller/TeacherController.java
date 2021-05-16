package com.example.contorller;

import com.example.domain.SubjectQuality;
import com.example.dto.TeacherRq;
import com.example.repository.DepartmentRepository;
import com.example.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Controller
public class TeacherController {

    private final TeacherService teacherService;
    private final DepartmentRepository departmentRepository;

    public TeacherController(TeacherService teacherService, DepartmentRepository departmentRepository) {
        this.teacherService = teacherService;
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("teacher")
    public String get(Model model) {
        model.addAttribute("departments", departmentRepository.findAll());
        return "teacher";
    }

//    @PostMapping("teacher")
//    public String save(@RequestBody TeacherRq teacherRq) {
//        teacherService.save(teacherRq);
//        return "redirect:/teacher";
//    }

    @PostMapping("teacher")
    public String save(@RequestParam String firstName,
                       @RequestParam String lastName,
                       @RequestParam String departmentUUID,
                       @RequestParam List<String> subjectQuality) {
        List<SubjectQuality> subjectQualities = subjectQuality.stream().map(s -> {
            SubjectQuality subjectQuality1 = new SubjectQuality();
            String[] strings = s.split(",");
            subjectQuality1.setName(strings[0]);
            subjectQuality1.setNumberOfHours(Integer.valueOf(strings[1]));
            subjectQuality1.setDepartmentUUID(UUID.fromString(departmentUUID));
            return subjectQuality1;
        }).collect(Collectors.toList());
        TeacherRq teacherRq = new TeacherRq(firstName, lastName, subjectQualities, UUID.fromString(departmentUUID));
        teacherService.save(teacherRq);
        return "redirect:/teacher";
    }
}
