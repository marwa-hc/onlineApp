package com.example.onlineapp.controllers;

import com.example.onlineapp.entities.Employe;
import com.example.onlineapp.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @PostMapping
    public Employe createEmploye(@RequestBody Employe employe) {
        return employeService.createEmploye(employe);
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Integer id) {
        return employeService.getEmployeById(id);
    }

    @GetMapping
    public List<Employe> getAllEmployes() {
        return employeService.getAllEmployes();
    }

    @PutMapping("/{id}")
    public Employe updateEmploye(@PathVariable Integer id, @RequestBody Employe employe) {
        return employeService.updateEmploye(id, employe);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Integer id) {
        employeService.deleteEmploye(id);
    }
}
