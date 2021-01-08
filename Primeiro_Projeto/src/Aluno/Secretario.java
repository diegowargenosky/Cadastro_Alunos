package Aluno;

import Interfaces.permitirAcesso;

public class Secretario extends Pessoa implements permitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	// Declarando as variáveis //
	private String login;
	private String senha;
	
	// Declarando o construtor pra receber os dois parâmetros //
	public Secretario(String login,String senha) {
		
		this.login = login;
		this.senha = senha;
		
	}

	

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}

	@Override
	public double salario() {

		return 4080.85;
	}

	


@Override
public boolean Autenticar() {
	
	return login.equals("Admin")&&senha.equals("Adtw");
}

	
}
