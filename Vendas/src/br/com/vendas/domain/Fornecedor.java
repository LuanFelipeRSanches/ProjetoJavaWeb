package br.com.vendas.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_fornecedores") // nome da tabela

@NamedQueries({ @NamedQuery(name = "Fornecedor.listar", query = "SELECT fornecedor FROM  Fornecedor fornecedor"),
		@NamedQuery(name = "Fornecedor.buscarPorCodigo", query = "SELECT fornecedor FROM  Fornecedor fornecedor WHERE fornecedor.codigo =  :codigo") })

public class Fornecedor {

	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	@Id
	@Column(name = "for_codigo") // nome da coluna
	private Long codigo;

	@Column(name = "for_descricao", length = 50, nullable = false) // length tamanho do campo / nullable se pode ser
																	// nulo ou não
	private String descricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Fornecedor [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

}
