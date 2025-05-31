package com.example.onlineapp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
@Table(name = "Employe")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmploye;

    private String nom;
    private String prenom;
    private String nomUtilisateur;
    private String telephone;
    private String motDePasse;
    private String codeDInvitation;
    private String titre;
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "ID_Admin")
    private Administrateur administrateur;

    @OneToMany(mappedBy = "employe", cascade = CascadeType.ALL)
    private List<Profile> profiles;
}
