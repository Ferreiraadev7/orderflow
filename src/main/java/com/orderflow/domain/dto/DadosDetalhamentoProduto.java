package com.orderflow.domain.dto;

import com.orderflow.domain.entity.Produto;

import java.math.BigDecimal;

public record DadosDetalhamentoProduto(
        Long id,
        String nome,
        String descricao ,
        BigDecimal preco,
        Integer estoque,
        boolean ativo) {

   public DadosDetalhamentoProduto(Produto produto){
        this(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getEstoque(),
                produto.getAtivo()
        );
   }
}
