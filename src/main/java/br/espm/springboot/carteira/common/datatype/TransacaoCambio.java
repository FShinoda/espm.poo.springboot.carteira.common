package br.espm.springboot.carteira.common.datatype;

import java.util.Date;

import br.espm.springboot.cambio.common.datatype.Cotacao;

public class TransacaoCambio {
    private String id;
    private Carteira carteira;
    private Cotacao cotacao;
    private Date data;
    private double qtd;

    public String getId(){
        return id;
    }

    public Carteira getCarteira(){
        return carteira;
    }

    public Cotacao getCotacao(){
        return cotacao;
    }

    public Date getData(){
        return data;
    }

    public double getQtd(){
        return qtd;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setCarteira(Carteira carteira){
        this.carteira = carteira;
    }

    public void setCotacao(Cotacao cotacao){
        this.cotacao = cotacao;
    }

    public void setData(Date data){
        this.data = data;
    }

    public void setQtd(double qtd){
        this.qtd = qtd;
    }
    
}
