package com.ricin.mspanier;

import com.ricin.mspanier.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
@EnableFeignClients
public class MsPanierApplication implements CommandLineRunner {
    @Autowired
    PanierRepo panierRepo;
    @Autowired
    ClientRepo clientRepo;

    public static void main(String[] args) {
        SpringApplication.run(MsPanierApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        HashSet<Long> produits = new HashSet<Long>();
        produits.add(1L);

        Panier p1 = panierRepo.save( new Panier(null, "panier 1", null, produits));
        Panier p2 = panierRepo.save(new Panier(null, "panier 2",  null, produits));
        Panier p3 = panierRepo.save(new Panier(null, "panier 3", null, produits));

        ArrayList<Panier> paniers = new ArrayList<>();

        paniers.add(p1);

        Client c1 = new Client(null, "client 1", null);
        c1.setPaniers(paniers);
        clientRepo.save(c1);

    }
}
