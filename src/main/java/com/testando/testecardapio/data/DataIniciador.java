package com.testando.testecardapio.config;

import com.testando.testecardapio.models.Produtos;
import com.testando.testecardapio.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataIniciador implements CommandLineRunner {

    @Autowired
    private ProdutosRepository produtosRepository;

    @Override
    public void run(String... args) throws Exception {
        // Verifica se a tabela já contém dados
        if (produtosRepository.count() == 0) {

            Produtos produto5 = new Produtos();
            produto5.setNome("Feijoada");
            produto5.setPrecoVenda("10.00");
            produto5.setPromocao("N");
            produto5.setDescricao("Feijão preto e arroz branco");
            produto5.setCaminhoImagem("caminho/para/imagem1.jpg");

            Produtos produto6 = new Produtos();
            produto6.setNome("Macarronada");
            produto6.setPrecoVenda("15.00");
            produto6.setPromocao("S");
            produto6.setDescricao("Macarrão");
            produto6.setCaminhoImagem("caminho/para/imagem2.jpg");

            produtosRepository.save(produto5);
            produtosRepository.save(produto6);

            System.out.println("Produtos inseridos com sucesso!");
        } else {
            System.out.println("Tabela já contém produtos. Nenhuma inserção foi realizada.");
        }
    }
}
