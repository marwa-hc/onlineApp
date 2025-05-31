package com.example.onlineapp.repositories;
import com.example.onlineapp.entities.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer>{

}
