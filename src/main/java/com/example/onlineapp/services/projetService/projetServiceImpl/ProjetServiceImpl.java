package com.example.onlineapp.services.projetService.projetServiceImpl;
import com.example.onlineapp.entities.Projet;
import com.example.onlineapp.repositories.ProjetRepository;
import com.example.onlineapp.services.projetService.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetServiceImpl implements ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    @Override
    public Projet createProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet getProjetById(Integer id) {
        return projetRepository.findById(id).orElse(null);
    }

    @Override
    public List<Projet> getAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet updateProjet(Integer id, Projet projet) {
        Optional<Projet> optionalProjet = projetRepository.findById(id);
        if (optionalProjet.isPresent()) {
            Projet existing = optionalProjet.get();
            existing.setNomProjet(projet.getNomProjet());
            existing.setUrlProjet(projet.getUrlProjet());
            existing.setStartDate(projet.getStartDate());
            existing.setEndDate(projet.getEndDate());
            existing.setPlateforme(projet.getPlateforme());
            existing.setDescription(projet.getDescription());
            existing.setTailleequipe(projet.getTailleequipe());
            existing.setTechnologies(projet.getTechnologies());
            existing.setRole(projet.getRole());
            existing.setEmploye(projet.getEmploye());
            return projetRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteProjet(Integer id) {
        projetRepository.deleteById(id);
    }
}
