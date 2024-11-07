package com.testando.testecardapio.controller;

import com.testando.testecardapio.models.Grupo;
import com.testando.testecardapio.models.Produtos;
import com.testando.testecardapio.service.GrupoService;
import com.testando.testecardapio.service.ProdutosService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    private final GrupoService grupoService;
    private final ProdutosService produtosService;

    public GrupoController(GrupoService grupoService, ProdutosService produtosService) {
        this.grupoService = grupoService;
        this.produtosService = produtosService;
    }

    @GetMapping
    public List<Grupo> getAllGrupos() {
        return grupoService.getAllGrupos();
    }

    @GetMapping("/{id}/produtos")
    public List<Produtos> getProdutosByGrupo(@PathVariable Long id) {
        return produtosService.getProdutosByGrupoId(id);
    }
}
