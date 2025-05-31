package com.example.onlineapp.services;
import com.example.onlineapp.entities.Profile;

import java.util.List;
public interface ProfileService {
    Profile createProfile(Profile profile);
    Profile getProfileById(Integer id);
    List<Profile> getAllProfiles();
    Profile updateProfile(Integer id, Profile profile);
    void deleteProfile(Integer id);
}
