package com.nestdigital.studentApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/")
    public String home()
    {
        return "hi this is home page";
    }

    @GetMapping("contact")
    public String contact()
    {
        return " home page";
    }
}
