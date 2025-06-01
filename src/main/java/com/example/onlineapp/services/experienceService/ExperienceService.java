package com.example.onlineapp.services.experienceService;
import com.example.onlineapp.entities.Experience;

import java.util.List;
public interface ExperienceService {
    Experience createExperience(Experience experience);
    Experience getExperienceById(Integer id);
    List<Experience> getAllExperiences();
    Experience updateExperience(Integer id, Experience experience);
    void deleteExperience(Integer id);
}
