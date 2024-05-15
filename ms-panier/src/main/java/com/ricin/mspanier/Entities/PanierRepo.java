package com.ricin.mspanier.Entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PanierRepo extends JpaRepository<Panier, Long> {
}
