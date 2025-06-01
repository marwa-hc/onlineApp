package com.example.onlineapp.services.experienceService.experienceServiceImpl;
import com.example.onlineapp.entities.Experience;
import com.example.onlineapp.repositories.ExperienceRepository;
import com.example.onlineapp.services.experienceService.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public Experience createExperience(Experience experience) {
        return experienceRepository.save(experience);
    }

    @Override
    public Experience getExperienceById(Integer id) {
        return experienceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Experience> getAllExperiences() {
        return experienceRepository.findAll();
    }

    @Override
    public Experience updateExperience(Integer id, Experience experience) {
        Optional<Experience> optional = experienceRepository.findById(id);
        if (optional.isPresent()) {
            Experience existing = optional.get();
            existing.setCategories(experience.getCategories());
            existing.setRole(experience.getRole());
            existing.setDescription(experience.getDescription());
            existing.setEmploye(experience.getEmploye());
            return experienceRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteExperience(Integer id) {
        experienceRepository.deleteById(id);
    }
}
