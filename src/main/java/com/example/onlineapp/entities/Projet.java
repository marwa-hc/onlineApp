package com.example.onlineapp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;

@Entity
@Table(name = "Projet")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ProjectID;
    @ManyToOne
    @JoinColumn(name = "ID_Employe")
    private Employe employe;
    private String nomProjet;
    private String urlProjet;
    private java.sql.Date startDate;
    private java.sql.Date endDate;
    private String plateforme;
    @Column(columnDefinition = "TEXT")
    private String description;
    private int tailleequipe;
    private String technologies;
    private String role;
}
