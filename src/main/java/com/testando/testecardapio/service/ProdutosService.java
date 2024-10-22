package com.testando.testecardapio.service;

import com.testando.testecardapio.models.Produtos;
import com.testando.testecardapio.repository.ProdutosRepository; // Assumindo que você tenha um repositório
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public List<Produtos> listarProdutos() {
        return produtosRepository.findAll();
    }
}
