package br.senai.sp.jandira.dao;

import java.util.ArrayList;

import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO {
	
	private  PlanoDeSaude planoDeSaude;
	private ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>() ;
	
	public PlanoDeSaudeDAO() {
	}
	
	public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}

	public void gravar(PlanoDeSaude planoDeSaude) {
		planosDeSaude.add(planoDeSaude);
	}
	
	public ArrayList<PlanoDeSaude> listarTodos(){
		return planosDeSaude;
		
	}
}
