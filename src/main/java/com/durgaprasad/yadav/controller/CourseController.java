package com.durgaprasad.yadav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/public/courses")
    public String getCourses() {
        return "courses";
    }
}
