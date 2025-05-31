package com.example.onlineapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;


@Entity
@Table(name = "Profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profileId;
    private String Pays;
    private String Entreprise;
    private String Email;
    private String email_alias;
    private Boolean Disponibilite;
    private Boolean ModificationMotspasse;

    @ManyToOne
    @JoinColumn(name = "employe_id")  // nom de la colonne FK en base
    private Employe employe;
}
