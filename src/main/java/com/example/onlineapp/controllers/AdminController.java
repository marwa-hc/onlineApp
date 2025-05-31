package com.example.onlineapp.controllers;
import com.example.onlineapp.entities.Administrateur;
import com.example.onlineapp.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @GetMapping("/admins")
    public List<Administrateur> getAllAdmins() {
        return adminService.getAllAdmins();
    }


    @GetMapping("/{id}")
    public Administrateur getAdminById(@PathVariable Integer id) {
        return adminService.getAdminById(id);
    }


    @PostMapping
    public Administrateur createAdmin(@RequestBody Administrateur admin) {
        return adminService.saveAdmin(admin);
    }


    @PutMapping("/{id}")
    public Administrateur updateAdmin(@PathVariable Integer id, @RequestBody Administrateur admin) {
        admin.setIdAdmin(id); // Pour être sûr que l'ID correspond
        return adminService.saveAdmin(admin);
    }


    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Integer id) {
        adminService.deleteAdmin(id);
    }
}
