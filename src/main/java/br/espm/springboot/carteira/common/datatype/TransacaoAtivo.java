package br.espm.springboot.carteira.common.datatype;

import java.math.BigDecimal;
import java.util.Date;

import br.espm.springboot.ativo.common.datatype.Ativo;

public class TransacaoAtivo {
    private String id;
    private Carteira carteira;
    private Ativo ativo;
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

    public Ativo getAtivo(){
        return ativo;
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

    public void setAtivo(Ativo ativo){
        this.ativo = ativo;
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
