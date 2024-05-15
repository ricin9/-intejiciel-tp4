package com.ricin.msproduits.Entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ProduitRepo  extends JpaRepository<Produit, Long> {
}
