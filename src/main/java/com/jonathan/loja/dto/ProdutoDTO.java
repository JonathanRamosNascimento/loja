package com.jonathan.loja.dto;

import java.io.Serializable;

import com.jonathan.loja.domain.Produto;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
  
  private Integer id;
	private String nome;
  private Double preco;
  
  public ProdutoDTO() {
  }

  public ProdutoDTO(Produto obj) {
    id = obj.getId();
    nome = obj.getNome();
    preco = obj.getPreco();
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getPreco() {
    return this.preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }
}