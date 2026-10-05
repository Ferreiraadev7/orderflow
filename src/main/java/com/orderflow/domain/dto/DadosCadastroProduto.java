package com.orderflow.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record DadosCadastroProduto(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @Positive
        @NotNull
        BigDecimal preco,
        @NotNull
        @PositiveOrZero
        Integer estoque ) {
}
