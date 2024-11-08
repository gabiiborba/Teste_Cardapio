package com.testando.testecardapio.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "produto")
@Getter
@Setter
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
    @JsonBackReference
    @JoinColumn(name = "id_grupo", nullable = false)
    private Grupo grupo;

    @Lob //Aplicada a atributos que armazenam grandes volumes de dados
    @Column(name = "caminho_imagem", nullable = false)
    private byte[] imagem;

    @PostLoad //Faz com que o método seja executado automaticamente sempre que uma entidade Produtos for carregada no bd
    public void verificarPromocao() {
        this.emPromocao = (Boolean) "S".equals(this.promocao); // Definir o valor do campo emPromocao
    }
}
