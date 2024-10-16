package com.testando.testecardapio.repository;

import com.testando.testecardapio.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
