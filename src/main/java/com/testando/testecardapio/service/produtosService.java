package com.testando.testecardapio.service;

import com.testando.testecardapio.models.produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produtosService {
    @Autowired
    private com.testando.testecardapio.repository.produtosRepository produtosRepository;

    public List<produtos> listarProdutos(){
        return produtosRepository.findAll();
    }
}
