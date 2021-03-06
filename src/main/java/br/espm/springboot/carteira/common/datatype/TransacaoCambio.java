package br.espm.springboot.carteira.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

import br.espm.springboot.cambio.common.datatype.Cotacao;

public class TransacaoCambio {
    private String id;
    private Carteira carteira;
    private Cotacao cotacao;
    private Date data;
    private BigDecimal qtd;
    private TransacaoTipo tipo;


    /// gets
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

    public BigDecimal getQtd(){
        return qtd;
    }

    public TransacaoTipo getTipo(){
        return tipo;
    }

    /// sets
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

    public void setQtd(BigDecimal qtd){
        this.qtd = qtd;
    }

    public void setTipo(TransacaoTipo tipo){
        this.tipo = tipo;
    }
    
}
