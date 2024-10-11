package com.testando.testecardapio.repository;

import com.testando.testecardapio.models.produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface produtosRepository extends JpaRepository<produtos, Long> {
}
