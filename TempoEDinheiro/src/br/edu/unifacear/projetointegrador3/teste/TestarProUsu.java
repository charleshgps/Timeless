package br.edu.unifacear.projetointegrador3.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;
import br.edu.unifacear.projetointegrador3.entidade.Usuario;

public class TestarProUsu {
	public static void main(String[] args) {

		Usuario u = new Usuario();
		u.setLogin("Cle123");
		u.setNome("Cleverson");
		u.setSenha("123456");

		Projeto p = new Projeto();
		p.setNome_projeto("Alfa Beta");
		p.setStatus_projeto("Backlog");
		
		Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		usuarioDao.inserir(u);
		Dao<Projeto> projetoDao = new GenericDao<Projeto>();
		projetoDao.inserir(p);

		/*
		 * Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		 * 
		 * Map<String, Object> argumentos = new HashMap<String, Object>();
		 * argumentos.put("nome projeto", "Alfa Beta");
		 * 
		 * String where = "where t.nome_projeto = :nome_projto ";
		 * 
		 * List<Usuario> usuarios = usuarioDao.listarWhere(Usuario.class, where,
		 * argumentos); for (Usuario u: usuarios) { System.out.println(u.getNome());
		 * 
		 * Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
		 * 
		 * argumentos = new HashMap<String, Object>(); argumentos.put("nome",
		 * "Cleverson");
		 * 
		 * where = "where t.nome = :nome ";
		 * 
		 * List<Usuario> usuarios = usuarioDao.listarWhere(Usuario.class, where,
		 * argumentos); for (Usuario u : usuarios) { System.out.println(u.getNome());
		 */
	}
}
