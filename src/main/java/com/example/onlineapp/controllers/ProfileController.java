package com.example.onlineapp.controllers;
import com.example.onlineapp.entities.Profile;
import com.example.onlineapp.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Profile create(@RequestBody Profile profile) {
        return profileService.createProfile(profile);
    }

    @GetMapping("/{id}")
    public Profile getById(@PathVariable Integer id) {
        return profileService.getProfileById(id);
    }

    @GetMapping
    public List<Profile> getAll() {
        return profileService.getAllProfiles();
    }

    @PutMapping("/{id}")
    public Profile update(@PathVariable Integer id, @RequestBody Profile profile) {
        return profileService.updateProfile(id, profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        profileService.deleteProfile(id);
    }
}
