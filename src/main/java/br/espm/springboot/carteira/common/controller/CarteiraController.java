package br.espm.springboot.carteira.common.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.espm.springboot.carteira.common.datatype.Carteira;

@FeignClient("carteira-service")
public interface CarteiraController {


    // Pega uma carteira em especifico
    @GetMapping("/carteiras/{id}")
    Carteira carteira(String id);

}
