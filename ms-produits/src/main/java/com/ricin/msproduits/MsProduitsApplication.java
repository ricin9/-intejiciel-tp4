package com.ricin.msproduits;

import com.ricin.msproduits.Entities.Produit;
import com.ricin.msproduits.Entities.ProduitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsProduitsApplication implements CommandLineRunner {

    @Autowired
    ProduitRepo produitRepo;

    public static void main(String[] args) {
        SpringApplication.run(MsProduitsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        produitRepo.save(new Produit(null, "prod 1", 99));
        produitRepo.save(new Produit(null, "prod 2", 199));
        produitRepo.save(new Produit(null, "prod 3", 299));
    }
}
