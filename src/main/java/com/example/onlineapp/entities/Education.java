package com.example.onlineapp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import jakarta.persistence.Entity;

@Entity
@Table(name = "Education")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer educationID;
    @ManyToOne
    @JoinColumn(name = "ID_Employe")
    private Employe employe;
    private String diplome;
    private String universite;
    private Date startDate;
    private Date endDate;
}
