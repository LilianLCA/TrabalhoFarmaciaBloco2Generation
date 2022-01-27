package org.farmaciagrupo2.farmaciaGrupo2.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//criação da tabela e o nome dado a mesma

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	//criação da ID e geração de número automático
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//nome do produto
	
	@NotBlank (message = "O atributo nome é obrigatório!")
	@Size(min = 2, max = 50, message = "O atributo título deve conter no mínimo 2 e no máximo 50 caracteres")
	private String nome;
	
	//descricao do produto
	
	@NotBlank (message = "O atributo descricao é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo descricao deve conter no mínimo 2 e no máximo 50 caracteres")
	private String descricao;
	
	//preco do produto
	//anotacao para informar valor positivo
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotBlank(message = "Preço é obrigatório!")
	@Positive(message = "O preço deve ser maior do que zero!")
	private BigDecimal preco;
	
	//anotação necessária para que a aplicação não retorne informações em loop
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	//getters and setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	

}
