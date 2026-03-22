package models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name= "TB_PRODUTOS")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private BigDecimal precoProduto;
    private int estoque;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(BigDecimal precoProduto) {
        this.precoProduto = precoProduto;
    }
    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
