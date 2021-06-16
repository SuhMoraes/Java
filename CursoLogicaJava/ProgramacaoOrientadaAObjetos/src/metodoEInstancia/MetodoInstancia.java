package metodoEInstancia;

public class MetodoInstancia {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.primeiroNome = "Suhailah";
		cliente.nomeComplemento = "Alves";
		cliente.telefone = "9999999999";
		cliente.email = "suh@gmail.com";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto());
		
	}

	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.nomeComplemento;
//		
//		return nomeCompleto;
//	}
}
