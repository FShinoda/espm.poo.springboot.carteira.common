package br.espm.springboot.carteira.common.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.espm.springboot.carteira.common.datatype.Carteira;
import br.espm.springboot.carteira.common.datatype.TransacaoAtivo;
import br.espm.springboot.carteira.common.datatype.TransacaoBean;
import br.espm.springboot.carteira.common.datatype.TransacaoCambio;

@FeignClient("carteira-service")
public interface CarteiraController {

    // Lista todas as carteiras
    @GetMapping("/carteiras")
    List<Carteira> listCarteiras();

    // Pega uma carteira em especifico
    @GetMapping("/carteiras/{id}")
    Carteira carteira(String id);

    // Cria carteira
    @PostMapping("/carteiras")
    Carteira create(@RequestBody Carteira carteira);

    // Compra cambio
    @PostMapping("/carteiras/cambio")
    TransacaoCambio cambioComprar(@PathVariable String idCarteira, @RequestBody TransacaoBean bean);
    
    // Vende cambio
    @PostMapping("carteiras/{id}/cambio/vender")
    TransacaoCambio cambioVender(@PathVariable String idCarteira, @RequestBody TransacaoBean bean);

    // Compra ativo
    @PostMapping("/carteiras/ativo")
    TransacaoAtivo ativoComprar(@PathVariable String idCarteira, @RequestBody TransacaoBean bean);
    
    // Vende ativo
    @PostMapping("carteiras/{id}/ativo/vender")
    TransacaoAtivo ativoVender(@PathVariable String idCarteira, @RequestBody TransacaoBean bean);

}
