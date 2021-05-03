package com.example.contorller;

import com.example.domain.Speciality;
import com.example.dto.SpecialityRq;
import com.example.service.SpecialityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpecialityController {

    private final SpecialityService specialityService;

    @Autowired
    public SpecialityController(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @PostMapping("speciality")
    public Speciality save(@RequestBody SpecialityRq speciality) {
        return specialityService.save(speciality);
    }
}
