package com.farmaciacrud.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo título é Obrigatório!")
	@Size(min = 4, max = 100, message = "O atributo marca deve conter no mínimo 04 e no máximo 100 caracteres")
	private String marca;
	
	
	private Integer quantidadeDisponivel;
	
	@NotBlank(message = "O atributo Indicacao é Obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo Indicação deve conter no mínimo 05 e no máximo 100 caracteres")
	private String indicacao;
	
	@NotBlank(message = "O atributo preço é Obrigatório!")
	private Double preco;
	
	
	@UpdateTimestamp
	private LocalDate dataEmissao;
	
	@NotBlank(message = "O atributo Data de Validade é Obrigatório!")
	@UpdateTimestamp
	private LocalDate dataValidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}

}
