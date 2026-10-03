package com.exemplo.fornecedoresservice.dto;

import java.math.BigDecimal;

// Copia dos campos do Produto do produtos-service, so para receber o JSON.
// Nao e entidade: o fornecedores-service nao salva produtos no seu banco.
public class ProdutoDTO {

    private Long id;
    private String nome;
    private BigDecimal preco;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Long id, String nome, BigDecimal preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
