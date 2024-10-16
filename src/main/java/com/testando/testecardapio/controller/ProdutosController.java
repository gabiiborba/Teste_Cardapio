package com.testando.testecardapio.controller;

import com.testando.testecardapio.models.Produtos;
import com.testando.testecardapio.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@Validated
public class ProdutosController {

    @Autowired
    private ProdutosService produtosService;

    @GetMapping
    public List<Produtos> listar(){
        return produtosService.listarProdutos();
    }
}
