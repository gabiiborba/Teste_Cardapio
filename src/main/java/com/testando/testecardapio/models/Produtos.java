package com.testando.testecardapio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String name;

    @Column(name = "preco_venda", nullable = false)
    private String price;

    @Column(name = "promocao", nullable = false)
    private String promocao;
    @Transient
    private Boolean emPromocao;

    @Column(name = "descricao", nullable = false)
    private String description;

    @Lob
    @Column(name = "caminho_imagem", nullable = false)
    private byte[] imagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
        this.setEmPromocao("S".equals(promocao)); // Define se está em promoção
    }

    public Boolean getEmPromocao() {
        return emPromocao;
    }

    public void setEmPromocao(Boolean emPromocao) {
        this.emPromocao = emPromocao;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
}
