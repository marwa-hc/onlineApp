package com.example.onlineapp.repositories;
import com.example.onlineapp.entities.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProfileRepository extends JpaRepository<Profile, Integer>{
}
