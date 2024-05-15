package com.ricin.msscholarity2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtablissement;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "etablissement")
    @JsonIgnore
    private List<Etudiant> lesEtudiants;
}
