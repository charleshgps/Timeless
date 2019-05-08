package br.edu.unifacear.projetointegrador3.teste;

import br.edu.unifacear.projetointegrador3.dao.Dao;
import br.edu.unifacear.projetointegrador3.dao.GenericDao;
import br.edu.unifacear.projetointegrador3.entidade.Atividade;
import br.edu.unifacear.projetointegrador3.entidade.Projeto;
import br.edu.unifacear.projetointegrador3.entidade.Release;
import br.edu.unifacear.projetointegrador3.entidade.Sprint;

public class TestarReleSpriPro {

	public static void main(String[] args) {
		/*Sprint s = new Sprint();
		s.setNum_sprint(01);
		s.setNome_sprint("Crud");
		s.setSituacao_sprint("Pra Fazer");*/

		Projeto p = new Projeto();
		p.setNome_projeto("Alfa Beta");
		p.setStatus_projeto("Release");
		
		Projeto p1 = new Projeto();
		p.setNome_projeto("Celta Delta");
		p.setStatus_projeto("Pra Fazer");

		Projeto p2 = new Projeto();
		p.setNome_projeto("Extrato");
		p.setStatus_projeto("Feito");
		
		Projeto p3 = new Projeto();
		p.setNome_projeto("Omega");
		p.setStatus_projeto("Em Pordução");
		
		Dao<Projeto> projetoDao = new GenericDao<Projeto>();
		projetoDao.inserir(p);
		projetoDao.inserir(p1);
		projetoDao.inserir(p2);
		projetoDao.inserir(p3);



		/*Release r = new Release();
		r.setNum_release(01);
		r.setNome_release("CRUDs");
		
		Atividade a = new Atividade();
		a.getData();

		Dao<Sprint> sprintDao = new GenericDao<Sprint>();
		sprintDao.inserir(s);
		
		Dao<Release> releaseDao = new GenericDao<Release>();
		releaseDao.inserir(r);
		Dao<Atividade> atividadeDao = new GenericDao<Atividade>();
		atividadeDao.inserir(a);*/
		
	}

}
