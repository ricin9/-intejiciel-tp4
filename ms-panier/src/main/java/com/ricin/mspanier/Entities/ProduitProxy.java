//package com.ricin.mspanier.Entities;
//
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@FeignClient(name = "ms-produits")
//@LoadBalancerClient(name="ms-produits")
//public interface ProduitProxy {
//    @GetMapping("produits/{id}")
//    public Produit getF(@PathVariable("id") Long id);
//}
