package ClassesAuxiliares;

import Interfaces.permitirAcesso;

// Realmente e somente receber algu�m que tem o contrato da interface de permitirAcesso
// e chamar o Autenticar //
public class Funcao_Autenticacao {
	
	private permitirAcesso permitirAcesso;

	public boolean autenticarCursoJava(permitirAcesso acesso) {

		return permitirAcesso.Autenticar();

	}
	


}
