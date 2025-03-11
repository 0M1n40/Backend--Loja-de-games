package com.generation.lojaDeGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table (name = "tb_produtos")
public class Produto {
	
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome é obrigatório") 
	private String nome;
	
	@NotNull (message = "A faixa etária  é obrigatória") 
	private int faixaEtaria;
	
	@NotBlank (message = "A descrição é obrigatória")
	@Size (min= 10, max = 300, message = "A descrição precisa ser maior que 10 carateres e menor que 1000")
	private String descricao;
	@NotNull (message = "Valor obriatório")
	private double valor;
	
	
	@ManyToOne
	@JsonIgnoreProperties ("produto")
	private Classe classe;
	
	
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
	public int getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Classe getClasse() {
		return classe;
	}
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	
	
	
}
