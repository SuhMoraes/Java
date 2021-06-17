package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setNome(" Manow Brown");
		cliente.setTelefone("99999999");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Telefone: " + cliente.getTelefone());
		
	}

}
