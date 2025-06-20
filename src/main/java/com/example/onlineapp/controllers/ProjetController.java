package com.example.onlineapp.controllers;
import com.example.onlineapp.entities.Projet;
import com.example.onlineapp.services.projetService.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/projets")
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @PostMapping("/{idEmploye}")
    public Projet createProjet(@PathVariable Long idEmploye, @RequestBody Projet projet) {
        return projetService.createProjet(projet, idEmploye);
    }
    @GetMapping("/{id}")
    public Projet getProjetById(@PathVariable Integer id) {
        return projetService.getProjetById(id);
    }

    @GetMapping
    public List<Projet> getAllProjets() {
        return projetService.getAllProjets();
    }

    @PutMapping("/{id}")
    public Projet updateProjet(@PathVariable Integer id, @RequestBody Projet projet) {
        return projetService.updateProjet(id, projet);
    }

    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable Integer id) {
        projetService.deleteProjet(id);
    }
}
