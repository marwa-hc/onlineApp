package com.example.onlineapp.services.educationService;

import com.example.onlineapp.entities.Education;

import java.util.List;
public interface EducationService {
    Education createEducation(Education education);
    Education getEducationById(Integer id);
    List<Education> getAllEducations();
    Education updateEducation(Integer id, Education education);
    void deleteEducation(Integer id);
}
