package com.orderflow.controller;

import com.orderflow.domain.dto.DadosCadastroProduto;
import com.orderflow.domain.dto.DadosDetalhamentoProduto;
import com.orderflow.domain.entity.Produto;
import com.orderflow.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

     private final ProdutoService produtoService;

         public ProdutoController(ProdutoService produtoService) {
             this.produtoService = produtoService;

     }

    @PostMapping
    public ResponseEntity<DadosDetalhamentoProduto> cadastrar(
            @Valid @RequestBody DadosCadastroProduto dados,
            UriComponentsBuilder uriBuilder) {

        Produto produto = produtoService.cadastrar(dados);

        DadosDetalhamentoProduto detalhamento =
                new DadosDetalhamentoProduto(produto);

        URI uri = uriBuilder
                .path("/produtos/{id}")
                .buildAndExpand(produto.getId())
                .toUri();

        return ResponseEntity
                .created(uri)
                .body(detalhamento);
        }

    }


