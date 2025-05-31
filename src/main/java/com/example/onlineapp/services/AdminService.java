package com.example.onlineapp.services;

import com.example.onlineapp.entities.Administrateur;

import java.util.List;

public interface AdminService {


    List<Administrateur> getAllAdmins();
    Administrateur getAdminById(Integer id);
    Administrateur saveAdmin(Administrateur admin);
    void deleteAdmin(Integer id);
}
