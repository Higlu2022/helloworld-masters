package clinicaMedica;

import java.util.Date;

public class Paciente {

	String nome;
	String rg;
	String endereco;
	String telefone;
	Date dataNascimento;
	String profissao;

	// 1� modificador de acesso
	// 2� tipo de retorno (primitivo ou Objeto)
	// 3� nome (qualquer nome que vc quiser dar)
	// 4� assinatura (parametros do metodo)

	public boolean verificarPacienteCadastrado(String rg) {
		String rgBD = "471571058-70";

		if (rgBD == (rg)) {
			return true;
		} else {
			return false;
		}

	}

	public void adicionarPaciente() {

	}

	public Paciente getPaciente() {
		return null;
	}

	public Paciente getConsulta() {
		return null;
	}

	public void adicionarConsulta() {

	}

	public void localizarPaciente() {

	}

	public String cadastrarPaciente(String nome, String rg) {
		return this.nome = nome;
	}

}
