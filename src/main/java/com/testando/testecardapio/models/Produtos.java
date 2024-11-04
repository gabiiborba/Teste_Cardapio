package com.testando.testecardapio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "produto")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define a estratégia de geração automática de valores para uma chave primária
    private Long id;

    @Column(name = "NOME", nullable = false) //Nullable é se aceita campo null ou não
    private String name;

    @Column(name = "preco_venda", nullable = false)
    private String price;

    @Column(name = "promocao", nullable = false)
    private String promocao;
    @Transient //O campo marcado não deve ser persistido no banco de dados
    private Boolean emPromocao;

    @Column(name = "descricao", nullable = false)
    private String description;

    // Relacionamento com o Grupo via id
    @ManyToOne
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo grupo;

    @Lob //Aplicada a atributos que armazenam grandes volumes de dados
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

    @PostLoad //Faz com que o método seja executado automaticamente sempre que uma entidade Produtos for carregada no bd
    public void verificarPromocao() {
        this.emPromocao = (Boolean) "S".equals(this.promocao); // Definir o valor do campo emPromocao
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
