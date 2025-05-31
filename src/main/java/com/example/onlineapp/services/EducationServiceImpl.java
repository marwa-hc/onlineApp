package com.example.onlineapp.services;
import com.example.onlineapp.entities.Education;
import com.example.onlineapp.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EducationServiceImpl implements EducationService{

    @Autowired
    private EducationRepository educationRepository;

    @Override
    public Education createEducation(Education education) {
        return educationRepository.save(education);
    }

    @Override
    public Education getEducationById(Integer id) {
        return educationRepository.findById(id).orElse(null);
    }

    @Override
    public List<Education> getAllEducations() {
        return educationRepository.findAll();
    }

    @Override
    public Education updateEducation(Integer id, Education education) {
        Optional<Education> optional = educationRepository.findById(id);
        if (optional.isPresent()) {
            Education existing = optional.get();
            existing.setDiplome(education.getDiplome());
            existing.setUniversite(education.getUniversite());
            existing.setStartDate(education.getStartDate());
            existing.setEndDate(education.getEndDate());
            existing.setEmploye(education.getEmploye());
            return educationRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteEducation(Integer id) {
        educationRepository.deleteById(id);
    }
}
