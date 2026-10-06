package com.orderflow.repository;

import com.orderflow.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    List<Produto> findByAtivoTrue();
    Optional<Produto> findByIdAndAtivoTrue(Long id);

}
