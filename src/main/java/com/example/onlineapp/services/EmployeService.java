package com.example.onlineapp.services;
import com.example.onlineapp.entities.Employe;

import java.util.List;
public interface EmployeService {
    Employe createEmploye(Employe employe);
    Employe getEmployeById(Integer id);
    List<Employe> getAllEmployes();
    Employe updateEmploye(Integer id, Employe employe);
    void deleteEmploye(Integer id);
}
