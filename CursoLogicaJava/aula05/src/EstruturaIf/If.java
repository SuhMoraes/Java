package EstruturaIf;

public class If {

	public static void main(String[] args) {
		Boolean movimentaPeloMetadeDoValor = true;
		Boolean tempoDeConta = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMetadeDoValor
				&& tempoDeConta && temNomeLimpo;
				
				if (liberarEmprestimo) {
					System.out.println("Empréstimo Liberado!");
				}

	}

}
