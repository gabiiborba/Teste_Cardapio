package com.testando.testecardapio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "produto", nullable = false)
    private String produto;

    @Column(name = "vendaproduto", nullable = false)
    private Double precoVenda;

    @Column(name = "promocao_produto", nullable = false)
    private Double promocao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Double getPromocao() {
        return promocao;
    }

    public void setPromocao(Double promocao) {
        this.promocao = promocao;
    }
}
