package com.example.onlineapp.repositories;

import com.example.onlineapp.entities.Administrateur;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminRepository extends JpaRepository<Administrateur, Integer> {

    Administrateur findByNomUtilisateur(String nomUtilisateur);
}
