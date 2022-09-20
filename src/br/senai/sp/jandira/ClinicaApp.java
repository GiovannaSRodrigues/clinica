package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		Especialidade especialidade1 = new Especialidade();
		Especialidade especialidade2 = new Especialidade();
		Especialidade especialidade3 = new Especialidade();
		Especialidade especialidade4 = new Especialidade();
		Especialidade especialidade5 = new Especialidade();
		PlanoDeSaude planoDeSaude1 = new PlanoDeSaude();
		PlanoDeSaude planoDeSaude2 = new PlanoDeSaude();
		Endereco endereco1 = new Endereco();
		Endereco endereco2 = new Endereco();
		Medico medico1 = new Medico();
		Medico medico2 = new Medico();
		Paciente paciente1 = new Paciente();
		Paciente paciente2 = new Paciente();
		Agenda agenda1 = new Agenda();
		Agenda agenda2 = new Agenda();

		// especialidades
		especialidade1.setNome("Cardiologia");
		especialidade2.setNome("Otorrinolaringologia");
		especialidade3.setNome("Fisioterapia");
		especialidade3.setDescricao("Ela estuda, diagnostica, previne e trata os distúrbios, entre outros, cinético-funcionais decorrentes de alterações de órgãos e sistemas humanos. ");
		especialidade4.setNome("Gastroenterologia");
		especialidade5.setNome("Clinica geral");

		// planosDeSaude
		planoDeSaude1.setOperadora("Bradesco");
		planoDeSaude1.setTipoDePlano("Pemium");

		planoDeSaude2.setOperadora("Unimed");
		planoDeSaude2.setTipoDePlano("Ouro");

		// endereços
		endereco1.setLogradouro("Rua Elton Silva");
		endereco1.setNumero("905");
		endereco1.setBairro("Centro");
		endereco1.setCidade("Jandira");
		endereco1.setEstado(Estados.SAO_PAULO);
		endereco1.setComplemento("Escola");
		endereco1.setPontoReferencia("Em frente à prefeitura");
		endereco1.setCep("06600-025");

		endereco2.setLogradouro("Av. Barão de Limeira");
		endereco2.setNumero("158");
		endereco2.setBairro("Santa Cecilia");
		endereco2.setCidade("São Paulo");
		endereco2.setEstado(Estados.SAO_PAULO);
		endereco2.setComplemento("Escola");
		endereco2.setCep("06658-006");

		// medicos

		medico1.setNome("Anna Paula");
		medico1.setCRM("8956-98");
		medico1.setSexo("Feminino");
		medico1.setDataNascimento(LocalDate.of(1997, 5, 15)); // 15/08/1997

		// DR.Anna é Clinica geral e Fisioterapeuta
		Especialidade[] especialidades = { especialidade3, especialidade5 };
		medico1.setEspecialidade(especialidades);

			//		System.out.println(especialidade3.getnome());
			//		System.out.println(especialidades[1].getnome());
			//		System.out.println(especialidades[0].getDescricao);
		
		
        //DR. Pedro Oliveira, nascido em 20/08/1984
		//cardiologia, fisioterapia e clinica geral
		medico2.setNome("Pedro Oliveira");
		medico2.setCRM("8795-63");
		medico2.setSexo("Masculino");
		medico2.setDataNascimento(LocalDate.of(1984, 8, 20)); 

		Especialidade[] especialidades1 = { especialidade1, especialidade3, especialidade5 };
		medico1.setEspecialidade(especialidades1);
		
		
		//Pacientes 
		paciente1.setNome("Cleiton");
		paciente1.setEndereco(endereco1);
		paciente1.setEmail("cleitonn105@gmail.com");
		paciente1.setCpf("34440479839");
		paciente1.setRg(" 378407843");
		paciente1.setTelefone("(11)95161-2029");
		paciente1.setGenero(Genero.MASCULINO);
		paciente1.setTipoSanguineo("A+");
		paciente1.setPlanoDeSaude(planoDeSaude1);
		
		
		paciente2.setNome("Giovanna");
		paciente2.setEndereco(endereco2);
		paciente2.setEmail("girodrigues03@gmail.com");
		paciente2.setCpf("43656584842");
		paciente2.setRg("53982253");
		paciente2.setTelefone("(11)98467-1547");
		paciente2.setGenero(Genero.FEMININO);
		paciente2.setTipoSanguineo("O+");
		paciente2.setPlanoDeSaude(planoDeSaude2);
		
		//Exibir os dados dos pacientes:
		//Nome:
		//Cidade:
		//Estado:
		//Telefone:
		//Operadora do plano de saúde:
		
//		System.out.println("Nome:"      +paciente1.getNome());
//		System.out.println("Cidade:"    +paciente1.getEndereco().getCidade());
//		System.out.println("Estado:"    +paciente1.getEndereco().getEstado());
//		System.out.println("Telefone:"  +paciente1.getTelefone());
//		System.out.println("Operadora:" +paciente1.getPlanoDeSaude().getOperadora());
//		System.out.println("------------------------------------------------------");
//		System.out.println("Nome:"     +paciente2.getNome());
//		System.out.println("Cidade:"   +paciente2.getEndereco().getCidade());
//		System.out.println("Estado:"   +paciente2.getEndereco().getEstado());
//		System.out.println("Telefone:" +paciente2.getTelefone());
//		System.out.println("Operadora:"+paciente2.getPlanoDeSaude().getOperadora());
		
		
		//Agendar consulta para Paciente1
		//Paciente1 - passar com clínico geral
		//No dia 22/09/2022, ás 15h25
		
		
		//Agendas
		agenda1.setPaciente(paciente1);
		agenda1.setMedico(medico2);
		agenda1.setEspecialidade(especialidade5);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 22));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 25));
		agenda1.setObservacao("Paciente possui alergia a Diazepan e reclama de muita dor nos pés");
		
		
		//Exibir os dados do agendamento
		//Nome do paciente:
		//Especialidade:
		//Nome do médico:
	    //Data e hora do atendimento:
	    //Observações
		//Plano de Saúde(Operadora):
		
		System.out.println("-----AGENDA-----");
		System.out.println("Nome do Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especilidade: " + agenda1.getEspecialidade().getnome());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora: " + agenda1.getHoraDaConsulta());
		System.out.println("Observações:" + agenda1.getObservacao());
		System.out.println("Plano de Saúde(Operadora):" + agenda1.getPaciente().getPlanoDeSaude().getOperadora() );
		System.out.println("______________________________________________________________________________");
		
		
		//Agendar consulta para Paciente2
				//Paciente1 - passar com cardiologista
				//No dia 26/09/2022, ás 09h00
		agenda2.setPaciente(paciente2);
		agenda2.setMedico(medico2);
		agenda2.setEspecialidade(especialidade1);
		agenda2.setDataDaConsulta(LocalDate.of(2022, 9, 26));
		agenda2.setHoraDaConsulta(LocalTime.of(9,00));
		agenda2.setObservacao("Coração está em fase terminal");
		
		//Exibir os dados do agendamento
				//Nome do paciente:
				//Especialidade:
				//Nome do médico:
			    //Data e hora do atendimento:
			    //Observações
				//Plano de Saúde(Operadora):
				
				System.out.println("-----AGENDA-----");
				System.out.println("Nome do Paciente: " + agenda2.getPaciente().getNome());
				System.out.println("Especilidade: " + agenda2.getEspecialidade().getnome());
				System.out.println("Médico: " + agenda2.getMedico().getNome());
				System.out.println("Data: " + agenda2.getDataDaConsulta());
				System.out.println("Hora: " + agenda2.getHoraDaConsulta());
				System.out.println("Observações:" + agenda2.getObservacao());
				System.out.println("Plano de Saúde(Operadora):" + agenda2.getPaciente().getPlanoDeSaude().getOperadora() );
				System.out.println("______________________________________________________________________________");

	}
}
