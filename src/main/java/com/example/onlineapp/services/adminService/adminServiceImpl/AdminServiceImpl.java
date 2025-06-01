package com.example.onlineapp.services.adminService.adminServiceImpl;


import com.example.onlineapp.entities.Administrateur;
import com.example.onlineapp.repositories.AdminRepository;
import com.example.onlineapp.services.adminService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AdminServiceImpl  implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Administrateur> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Administrateur getAdminById(Integer id) {
        return adminRepository.findById(id).orElse(null);
    }

    @Override
    public Administrateur saveAdmin(Administrateur admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Integer id) {
        adminRepository.deleteById(id);
    }
}
