package com.orderflow.domain.dto;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record DadosAtualizacaoProduto(
        String nome,
        String descricao,
        @Positive
        BigDecimal preco,
        @PositiveOrZero
        Integer estoque
){

}
