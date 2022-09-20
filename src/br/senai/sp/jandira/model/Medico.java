package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nome;
	private LocalDate dataNascimento;
	private String sexo;
	private Especialidade[] especialidade;
	private String CRM;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Especialidade[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade[] especialidades) {
		this.especialidade = especialidades;
	}
	public String getCRM() {
		return CRM;
	}
	public void setCRM(String cRM) {
		CRM = cRM;
	}
}
