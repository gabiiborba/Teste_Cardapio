package com.testando.testecardapio.repository;

import com.testando.testecardapio.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    List<Produtos> findByPromocao(String promocao);
    List<Produtos> findAll();
    List<Produtos> findByGrupoId(Long grupoId);
}
