package com.ricin.msscholarity2.repos;

import com.ricin.msscholarity2.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findEtudiantsByDateNaissanceBefore(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date d);

    Long countEtudiantByIdFormation(Long idFormation);
}
