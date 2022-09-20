package br.senai.sp.jandira.model;

public class Especialidade {

	 private String nome;
	 private String descricao;
	 
	 //Metódo de acesso getters and setters
	 
	 public void setNome (String novoNome) {
		 nome = novoNome;
    }
	 
	 public String getnome(){
		 return nome;
	 }

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	} 
}

   