package com.example.onlineapp.services.employeService.employeServiceImpl;

import com.example.onlineapp.entities.Employe;
import com.example.onlineapp.repositories.EmployeRepository;
import com.example.onlineapp.services.employeService.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class EmployeServiceImpl implements EmployeService {
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe createEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Integer id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> getAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe updateEmploye(Integer id, Employe updatedEmploye) {
        Optional<Employe> existing = employeRepository.findById(id);
        if (existing.isPresent()) {
            Employe e = existing.get();
            e.setNom(updatedEmploye.getNom());
            e.setPrenom(updatedEmploye.getPrenom());
            e.setNomUtilisateur(updatedEmploye.getNomUtilisateur());
            e.setTelephone(updatedEmploye.getTelephone());
            e.setMotDePasse(updatedEmploye.getMotDePasse());
            e.setCodeDInvitation(updatedEmploye.getCodeDInvitation());
            e.setTitre(updatedEmploye.getTitre());
            e.setEmail(updatedEmploye.getEmail());
            e.setAddress(updatedEmploye.getAddress());
            e.setAdministrateur(updatedEmploye.getAdministrateur());
            return employeRepository.save(e);
        }
        return null;
    }

    @Override
    public void deleteEmploye(Integer id) {
        employeRepository.deleteById(id);
    }
}
