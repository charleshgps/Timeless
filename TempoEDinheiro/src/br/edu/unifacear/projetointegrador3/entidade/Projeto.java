package br.edu.unifacear.projetointegrador3.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PROJETO")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_projeto;
	private String nome_projeto;
	private String status_projeto;

	@ManyToMany
	private List<Usuario> usuarios;
	@ManyToMany
	private List<Sprint> sprints;

	/*
	 * @ManyToMany private List<Fita> fitas;
	 * 
	 * private Date dataAluguel; private Date dataDevolucao;
	 */

	public Integer getId_projeto() {
		return id_projeto;
	}

	public void setId_projeto(Integer id_projeto) {
		this.id_projeto = id_projeto;
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getStatus_projeto() {
		return status_projeto;
	}

	public void setStatus_projeto(String status_projeto) {
		this.status_projeto = status_projeto;
	}

}
