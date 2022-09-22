package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Basic");
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		System.out.println(dao.listarTodos());
	}
}
	
//		//Vetor com 3 planos de saúde
//		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
//		planoDeSaude1.setOperadora("Bradesco");
//		planoDeSaude1.setTipoDePlano("Pemium");
//		
//		PlanoDeSaude[] planos = {
//				planoDeSaude1, 
//				new PlanoDeSaude("Porto Seguro"),
//				new PlanoDeSaude("Allianz", "Ouro")
//				};
//
//		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
//		planoDeSaude2.setOperadora("Unimed");
//		planoDeSaude2.setTipoDePlano("Ouro");
//
//		
//		System.out.println(planos[0].getOperadora());
//		System.out.println(planos[0].getTipoDePlano());
//		System.out.println(planos[1].getOperadora());
//		System.out.println(planos[1].getTipoDePlano());
//		System.out.println(planos[2].getOperadora());
//		System.out.println(planos[2].getDadosDoPlano());
//		
//		//Utilização do ArrayList
//		ArrayList<String> cidades = new ArrayList<>();
//		cidades.add("São Paulo");
//		cidades.add("Jandira");
//		cidades.add("Barueri");
//		cidades.add("Itapevi");
//		cidades.add("Cotia");
//		cidades.add("Carapicuíba");
//		
//		System.out.println(cidades.get(4));
//		System.out.println(cidades.size());
//		
//		ArrayList<PlanoDeSaude> planoDeSaude2 = new ArrayList<>();
//		planoDeSaude2.add(new PlanoDeSaude("Notredame"));
//		planoDeSaude2.add(new PlanoDeSaude("Ativia", "Advanced"));
//		planoDeSaude2.add(new PlanoDeSaude("Bio Saúde"));
//		planoDeSaude2.add(new PlanoDeSaude("Blue Med", "Exclusive"));
//		
//		PlanoDeSaude planoNovo = new PlanoDeSaude();
//		planoNovo.setOperadora("Ameplan");
//		planoNovo.setTipoDePlano("Prata");
//		
//		planoDeSaude2.add(planoNovo);
//		
//		//Adicionar o tipo do plano no plano Notredame
//		planoDeSaude2.get(0).setTipoDePlano("Basic");
//		
//		System.out.println(planoDeSaude2.get(4).getDadosDoPlano());
//		System.out.println(planoDeSaude2.get(0).getDadosDoPlano());
//		
//		int nota1 = 10;
//		Integer nota2 = 5;
//		
//		ArrayList<Double> precosList = new ArrayList<>();
//		precosList.add(5.9);
//		
//		
//		
//
//	}
//
//}
