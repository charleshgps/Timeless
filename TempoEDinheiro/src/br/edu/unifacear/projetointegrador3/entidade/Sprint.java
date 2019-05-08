package br.edu.unifacear.projetointegrador3.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SPRINT")
public class Sprint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer num_sprint;
	private String nome_sprint;
	private String situacao_sprint;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNum_sprint() {
		return num_sprint;
	}

	public void setNum_sprint(Integer num_sprint) {
		this.num_sprint = num_sprint;
	}

	public String getNome_sprint() {
		return nome_sprint;
	}

	public void setNome_sprint(String nome_sprint) {
		this.nome_sprint = nome_sprint;
	}

	public String getSituacao_sprint() {
		return situacao_sprint;
	}

	public void setSituacao_sprint(String situacao_sprint) {
		this.situacao_sprint = situacao_sprint;
	}

}
