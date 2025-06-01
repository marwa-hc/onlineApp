package com.example.onlineapp.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer profileId;
    private String pays;
    private String entreprise;
    private String email;
    private String email_alias;
    private Boolean disponibilite;
    private Boolean modificationMotspasse;
    @ManyToOne
    @JoinColumn(name = "employe_id")  // FK column in DB
    @JsonBackReference
    private Employe employe;
}
