package br.senai.sp.jandira.model;

public class PlanoDeSaude {
        
	private String operadora;
	private String tipoDePlano;
	
	//Metodos de acesso 
	
	 public void setOperadora (String operadora) {
		 this.operadora = operadora;
		 
	}
	 
	 public String getOperadora() {
		  return this.operadora;
	 }
	
	 
	 public void setTipoDePlano(String tipoDePlano) {
	     this.tipoDePlano = tipoDePlano;

	}
	 
	 public String getTipoDePlano() {
		 return tipoDePlano;
	 }
	 
	 public String getDadosDoPlano() {
		 return "Plano: " + this.operadora + "," + this.tipoDePlano;
	 }
	 
	 
}
