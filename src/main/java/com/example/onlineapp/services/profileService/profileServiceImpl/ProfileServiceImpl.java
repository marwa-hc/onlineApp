package com.example.onlineapp.services.profileService.profileServiceImpl;
import com.example.onlineapp.entities.Profile;
import com.example.onlineapp.repositories.ProfileRepository;
import com.example.onlineapp.services.profileService.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public Profile createProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Profile getProfileById(Integer id) {
        return profileRepository.findById(id).orElse(null);
    }

    @Override
    public List<Profile> getAllProfiles() {
        return profileRepository.findAll();
    }

    @Override
    public Profile updateProfile(Integer id, Profile profile) {
        Optional<Profile> optional = profileRepository.findById(id);
        if (optional.isPresent()) {
            Profile existing = optional.get();
            existing.setPays(profile.getPays());
            existing.setEntreprise(profile.getEntreprise());
            existing.setEmail(profile.getEmail());
            existing.setEmail_alias(profile.getEmail_alias());
            existing.setDisponibilite(profile.getDisponibilite());
            existing.setModificationMotspasse(profile.getModificationMotspasse());
            return profileRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteProfile(Integer id) {
        profileRepository.deleteById(id);
    }
}
