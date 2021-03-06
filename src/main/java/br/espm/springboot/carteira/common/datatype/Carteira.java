package br.espm.springboot.carteira.common.datatype;

import java.math.BigDecimal;
import java.util.List;


public class Carteira {

    private String id;
    // private Usuario usuario
    private BigDecimal saldo;
    private List<TransacaoCambio> transacoesCambio;
    private List<TransacaoAtivo> transacoesAtivo;

    public String getId(){
        return id;
    }

    public BigDecimal getSaldo(){
        return saldo;
    }

    public List<TransacaoCambio> getTransacoesCambio(){
        return transacoesCambio;
    }

    public List<TransacaoAtivo> getTransacoesAtivo(){
        return transacoesAtivo;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public void setTransacoesCambio(List<TransacaoCambio> transacoesCambio){
        this.transacoesCambio = transacoesCambio;
    }

    public void setTransacoesAtivo(List<TransacaoAtivo> transacoesAtivo){
        this.transacoesAtivo = transacoesAtivo;
    }
    
    
}
