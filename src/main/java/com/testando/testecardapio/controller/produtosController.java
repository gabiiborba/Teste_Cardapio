package com.testando.testecardapio.controller;

import com.testando.testecardapio.models.produtos;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@Validated
public class produtosController {

    private com.testando.testecardapio.service.produtosService produtosService;

    /**
     * Lista todos os produtos.
     *
     * @return uma lista de produtos
     */
    @GetMapping
    public List<produtos> listar(){
        return produtosService.listarProdutos();
    }
}
