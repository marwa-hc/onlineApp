package com.example.onlineapp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import jakarta.persistence.Entity;


@Entity
@Table(name = "Experience")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer experienceID;
    @ManyToOne
    @JoinColumn(name = "ID_Employe")
    private Employe employe;

    private String categories;
    private String role;

    @Column(columnDefinition = "TEXT")
    private String description;
}
