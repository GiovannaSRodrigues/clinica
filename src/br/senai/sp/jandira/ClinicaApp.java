package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		
		especialidade.setNome("Cardiologia");
		System.out.println(especialidade.getnome());

		
		planoDeSaude1.setOperadora("Bradesco");
		planoDeSaude1.setTipoDePlano("Pemium");
		
		planoDeSaude2.setOperadora("Unimed");
		planoDeSaude2.setTipoDePlano("Ouro");
		System.out.println(planoDeSaude2.getTipoDePlano());
		
		JOptionPane.showMessageDialog(null, planoDeSaude1.getOperadora());
		JOptionPane.showMessageDialog(null, planoDeSaude1.getTipoDePlano());
	}

}
