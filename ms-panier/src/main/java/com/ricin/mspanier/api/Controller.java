package com.ricin.mspanier.api;

import com.ricin.mspanier.Entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
public class Controller {
    @Autowired
    ClientRepo clientRepo;
    @Autowired
    PanierRepo panierRepo;
//    @Autowired
//    ProduitProxy produitProxy;

    @GetMapping("/clientproduits/{id}")
    public List<Produit> getClient(@PathVariable("id") Long id) {
        List<Panier> paniers = clientRepo.findById(id).get().getPaniers();
        List<Produit> produits = new ArrayList<>();
        for (Panier p : paniers){
            for (Long productId : p.getProduits()) {
//                produits.add(produitProxy.getF(productId));
            }
        }
        return produits;
    }

}
