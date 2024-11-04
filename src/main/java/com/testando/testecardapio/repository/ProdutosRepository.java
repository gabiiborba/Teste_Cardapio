package com.testando.testecardapio.repository;

import com.testando.testecardapio.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

    List<Produtos> findByPromocao(String promocao);
    //@Query(value = "SELECT p.id, p.descricao,null as caminho_imagem,p.nome,p.preco_venda,p.promocao FROM produto p WHERE not excluido ORDER BY descricao_pdv;",nativeQuery = true)
    List<Produtos> findAll();
}
