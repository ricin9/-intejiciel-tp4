package com.ricin.mspanier.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPanier;

    @Column()
    private String nom;

    @ManyToMany(mappedBy = "paniers")
    private List<Client> clients;

    @ElementCollection()
    @Column()
    private Set<Long> produits = new HashSet<Long>();

}
