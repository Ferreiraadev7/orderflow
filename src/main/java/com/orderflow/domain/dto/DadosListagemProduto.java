package com.orderflow.domain.dto;

import com.orderflow.domain.entity.Produto;

import java.math.BigDecimal;

public record DadosListagemProduto(
        Long id,
        String nome,
        BigDecimal preco,
        Integer estoque) {

    public DadosListagemProduto(Produto produto) {

        this(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getEstoque());
    }



}
