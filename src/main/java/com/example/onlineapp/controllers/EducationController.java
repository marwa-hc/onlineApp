package com.example.onlineapp.controllers;

import com.example.onlineapp.entities.Education;
import com.example.onlineapp.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/education")
public class EducationController {

    @Autowired
    private EducationService educationService;

    @PostMapping
    public Education create(@RequestBody Education education) {
        return educationService.createEducation(education);
    }

    @GetMapping("/{id}")
    public Education getById(@PathVariable Integer id) {
        return educationService.getEducationById(id);
    }

    @GetMapping
    public List<Education> getAll() {
        return educationService.getAllEducations();
    }

    @PutMapping("/{id}")
    public Education update(@PathVariable Integer id, @RequestBody Education education) {
        return educationService.updateEducation(id, education);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        educationService.deleteEducation(id);
    }
}
