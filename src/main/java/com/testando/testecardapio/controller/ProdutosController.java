package com.testando.testecardapio.controller;

import com.testando.testecardapio.models.Produtos;
import com.testando.testecardapio.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutosRepository produtosRepository;

    @GetMapping
    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }
}
