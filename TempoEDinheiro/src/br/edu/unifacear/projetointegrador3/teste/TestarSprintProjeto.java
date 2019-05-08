package br.edu.unifacear.projetointegrador3.teste;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;

public class TestarSprintProjeto {
	public static void main(String[] args) {

		/*
		 * Sprint s = new Sprint(); s.setNum_sprint(01); s.setNome_sprint("Crud");
		 * s.setSituacao_sprint("Pra Fazer");
		 * 
		 * Projeto p = new Projeto(); p.setNome_projeto("Alfa Beta");
		 * p.setStatus_projeto("Release");
		 * 
		 * Dao<Sprint> sprintDao = new GenericDao<Sprint>(); sprintDao.excluir(s);
		 * Dao<Projeto> projetoDao = new GenericDao<Projeto>(); projetoDao.inserir(p);
		 */
		Dao<Projeto> projetoDao = new GenericDao<Projeto>();

		Map<String, Object> argumentos = new HashMap<String, Object>();
		argumentos.put("nome_projeto", "Omega");

		String where = "where t.nome_projeto = :nome_projeto ";

		/*
		 * List<Projeto> projetos = projetoDao.listarWhere(Projeto.class, where,
		 * argumentos); for (Projeto p : projetos) {
		 * System.out.println(p.getId_projeto());
		 * System.out.println(p.getNome_projeto());
		 * System.out.println(p.getStatus_projeto()); } // projetos.remove(2);
		 */

		List<Projeto> listaprojetos = projetoDao.listarTodos(Projeto.class);
		for (Projeto p : listaprojetos) {
			System.out.println(p.getId_projeto());
			System.out.println(p.getNome_projeto());
			System.out.println(p.getStatus_projeto());
		}

		/*
		 * System.out.println(""); System.out.println("TESTE REMOVER");
		 * System.out.println("");
		 * 
		 * for (
		 * 
		 * Projeto p : listaprojetos) { System.out.println(p.getId_projeto());
		 * System.out.println(p.getNome_projeto());
		 * System.out.println(p.getStatus_projeto());
		 * 
		 * }
		 * 
		 */
		String nome = "Alfa Beta";
		for (Projeto p : listaprojetos) {
			if (p.getNome_projeto().equals(nome)) {
				p.setNome_projeto("Omega");
				projetoDao.alterar(p);
			} else {
				break;
			}
		}
		for (Projeto p : listaprojetos) {
			System.out.println(p.getId_projeto());
			System.out.println(p.getNome_projeto());
			System.out.println(p.getStatus_projeto());

		}

	}

	/*
	 * Dao<Usuario> usuarioDao = new GenericDao<Usuario>();
	 * 
	 * argumentos = new HashMap<String, Object>(); argumentos.put("nome",
	 * "Cleverson");
	 * 
	 * where = "where t.nome = :nome ";
	 * 
	 * List<Usuario> usuarios = usuarioDao.listarWhere(Usuario.class, where,
	 * argumentos); for (Usuario u : usuarios) { System.out.println(u.getNome()); }
	 */
}
