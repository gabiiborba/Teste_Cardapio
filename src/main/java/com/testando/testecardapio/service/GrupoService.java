package com.testando.testecardapio.service;

import com.testando.testecardapio.models.Grupo;
import com.testando.testecardapio.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {
    private final GrupoRepository grupoRepository;

    public GrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public List<Grupo> getAllGrupos() {
        return grupoRepository.findAll();
    }

    public Grupo getGrupoById(Long id) {
        return grupoRepository.findById(id).orElse(null);
    }

}
