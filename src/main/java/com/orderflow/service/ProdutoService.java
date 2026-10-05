package com.orderflow.service;

import com.orderflow.domain.dto.DadosCadastroProduto;
import com.orderflow.domain.entity.Produto;
import com.orderflow.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }
    public Produto cadastrar(DadosCadastroProduto dados){

        Produto produto = new Produto(dados);


        return repository.save(produto);

    }
}
