package com.testando.testecardapio.controller;

import com.testando.testecardapio.models.Grupo;
import com.testando.testecardapio.service.GrupoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grupos")
public class GrupoController {
    private final GrupoService grupoService;
    public GrupoController(GrupoService grupoService) {
        this.grupoService = grupoService;
    }

    @GetMapping
    public List<Grupo> getAllGrupos() {
        return grupoService.getAllGrupos();
    }

    @GetMapping("/{id}")
    public Grupo getGrupoById(@PathVariable Long id) {
        return grupoService.getGrupoById(id);
    }
}
