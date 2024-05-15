package com.ricin.msscholarity2.entities;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formation")
@LoadBalancerClient(name="ms-formation")
public interface FormationProxy {

    @GetMapping("formations/{id}")
    @CircuitBreaker(name="fall", fallbackMethod = "fallbackFormation" )
    public Formation getF(@PathVariable("id") Long id);
    default Formation fallbackFormation( @PathVariable("id") Long idf,
                                         Throwable throwable){

        return null;
    }
}