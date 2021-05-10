package com.example.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class initialDataController {
    @GetMapping("initial")
    public String get() {
        return "initialData";
    }
}
