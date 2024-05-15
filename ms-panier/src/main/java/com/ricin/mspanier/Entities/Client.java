package com.ricin.mspanier.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;

    @Column()
    private String nom;
    @ManyToMany(targetEntity = Panier.class)
    @JoinTable(name = "client_panier",
            joinColumns = { @JoinColumn(name = "idClient") },
            inverseJoinColumns = { @JoinColumn(name = "idPanier") })
    private List<Panier> paniers;


}
