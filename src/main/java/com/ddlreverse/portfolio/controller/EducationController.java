package com.ddlreverse.portfolio.controller;

import com.ddlreverse.portfolio.model.Education;
import com.ddlreverse.portfolio.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("education")
public class EducationController {
    @Autowired
    EducationService educationService;
    @GetMapping("all-educations")
    public ResponseEntity<List<Education>> getAllEducations() {
        return educationService.getAllEducations();
    }
    @PostMapping("add-education")
    public ResponseEntity<String> addEducation(@RequestBody Education education) {
        return educationService.addEducation(education);
    }
}
