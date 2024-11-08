package com.testando.testecardapio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdutosDto {
    private String name;
    private String description;
    private double price;
    private int promocao;
    private byte[] imagem;
}
