package com.example.onlineapp.services.projetService;
import com.example.onlineapp.entities.Projet;

import java.util.List;

public interface ProjetService {
    Projet createProjet(Projet projet);
    Projet getProjetById(Integer id);
    List<Projet> getAllProjets();
    Projet updateProjet(Integer id, Projet projet);
    void deleteProjet(Integer id);
}
