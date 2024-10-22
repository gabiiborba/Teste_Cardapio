package com.testando.testecardapio.data;

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
        if (produtosRepository.count() == 0) {

            Produtos produto5 = new Produtos();
            produto5.setName("Feijoada");
            produto5.setPrice("10.00");
            produto5.setPromocao("N");
            produto5.setDescription("Feijão preto e arroz branco");
            //produto5.setImagem("caminho/para/imagem1.jpg");

            Produtos produto6 = new Produtos();
            produto6.setName("Macarronada");
            produto6.setPrice("15.00");
            produto6.setPromocao("S");
            produto6.setDescription("Macarrão");
            //produto6.setImagem("caminho/para/imagem2.jpg");

            produtosRepository.save(produto5);
            produtosRepository.save(produto6);

            System.out.println("Produtos inseridos com sucesso!");
        } else {
            System.out.println("Tabela já contém produtos. Nenhuma inserção foi realizada.");
        }
    }
}
