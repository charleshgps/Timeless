package br.edu.unifacear.projetointegrador3.entidade;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_RELEASE")
public class Release {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;
 private Integer num_release;
 private String nome_release;
 @ManyToOne
 private Projeto projetos;
 @ManyToOne
 private Sprint sprints;
 @ManyToOne
 private Usuario usuarios;
 @ManyToOne
 private Atividade atividades;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public Integer getNum_release() {
  return num_release;
 }

 public void setNum_release(Integer num_release) {
  this.num_release = num_release;
 }

 public String getNome_release() {
  return nome_release;
 }

 public void setNome_release(String nome_release) {
  this.nome_release = nome_release;
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

 public Usuario getUsuarios() {
  return usuarios;
 }

 public void setUsuarios(Usuario usuarios) {
  this.usuarios = usuarios;
 }

public Atividade getAtividades() {
	return atividades;
}

public void setAtividades(Atividade atividades) {
	this.atividades = atividades;
}
 

}