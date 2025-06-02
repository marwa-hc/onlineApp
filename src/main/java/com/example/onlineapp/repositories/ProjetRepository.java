package com.example.onlineapp.repositories;

import com.example.onlineapp.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Integer>{
}
