package br.edu.unifacear.projetointegrador3.entidade;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ATIVIDADE")
public class Atividade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id_atividade;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Projeto projetos;
	@ManyToOne
	private Sprint sprints;
	private Date data;
	private Time hora;

	public Integer getId_atividade() {
		return id_atividade;
	}

	public void setId_atividade(Integer id_atividade) {
		this.id_atividade = id_atividade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Projeto getProjetos() {
		return projetos;
	}

	public void setProjetos(Projeto projetos) {
		this.projetos = projetos;
	}

	public Sprint getSprints() {
		return sprints;
	}

	public void setSprints(Sprint sprints) {
		this.sprints = sprints;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

}
