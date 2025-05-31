package com.example.onlineapp.controllers;
import com.example.onlineapp.entities.Experience;
import com.example.onlineapp.services.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @PostMapping
    public Experience create(@RequestBody Experience experience) {
        return experienceService.createExperience(experience);
    }

    @GetMapping("/{id}")
    public Experience getById(@PathVariable Integer id) {
        return experienceService.getExperienceById(id);
    }

    @GetMapping
    public List<Experience> getAll() {
        return experienceService.getAllExperiences();
    }

    @PutMapping("/{id}")
    public Experience update(@PathVariable Integer id, @RequestBody Experience experience) {
        return experienceService.updateExperience(id, experience);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        experienceService.deleteExperience(id);
    }
}
