package com.ricin.msscholarity2.repos;

import com.ricin.msscholarity2.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
}
