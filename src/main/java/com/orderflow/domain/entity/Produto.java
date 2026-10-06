package com.orderflow.domain.entity;

import com.orderflow.domain.dto.DadosAtualizacaoProduto;
import com.orderflow.domain.dto.DadosCadastroProduto;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer estoque;
    private Boolean ativo;

    public Produto() {

    }
    public Produto(DadosCadastroProduto dados){

        this.nome = dados.nome();
        this.descricao = dados.descricao();
        this.preco = dados.preco();
        this.estoque = dados.estoque();
        this.ativo = true;

    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public Integer getEstoque() {
        return estoque;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public String getDescricao() {
        return descricao;
    }

    public void atualizar(DadosAtualizacaoProduto dados){
        if (dados.nome() != null){
            this.nome = dados.nome();
        }
        if (dados.descricao() != null){
            this.descricao = dados.descricao();
        }
        if (dados.preco() != null){
            this.preco = dados.preco();
        }
        if (dados.estoque() != null){
            this.estoque = dados.estoque();
        }
    }

    public void desativar(){
        this.ativo = false;
    }
}




