package br.espm.springboot.carteira.common.datatype;

import java.util.List;


public class Carteira {

    private String id;
    // private Usuario usuario
    private double saldo;
    private List<TransacaoCambio> transacoesCambio;

    public String getId(){
        return id;
    }

    public double getSaldo(){
        return saldo;
    }

    public List<TransacaoCambio> getTransacoesCambio(){
        return transacoesCambio;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setTransacoesCambio(List<TransacaoCambio> transacoesCambio){
        this.transacoesCambio = transacoesCambio;
    }

    
}
