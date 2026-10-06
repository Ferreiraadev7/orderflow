package com.orderflow.service;

import com.orderflow.domain.dto.DadosAtualizacaoProduto;
import com.orderflow.domain.dto.DadosCadastroProduto;
import com.orderflow.domain.entity.Produto;
import com.orderflow.repository.ProdutoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


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

    public List<Produto> listar(){
        return repository.findAll();
    }

    public Produto buscarPorId(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND,
                        "Produto não encontrado"
                ));
    }
    public Produto atualizar(Long id, DadosAtualizacaoProduto dados){
        Produto produto = buscarPorId(id);
        produto.atualizar(dados);
        return repository.save(produto);
    }
}
