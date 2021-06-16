package metodoEInstancia;

public class Cliente {
	
	String primeiroNome;
	
	String nomeComplemento;
	
	String telefone;
	
	String email;
	
	String obterNomeCompleto() { // Sem necessidade de static void e declarar os parametros
		String nomeCompleto = primeiroNome + " " + nomeComplemento; // Usando as propriedades diretamente
		
		return nomeCompleto;
	}
	

}
