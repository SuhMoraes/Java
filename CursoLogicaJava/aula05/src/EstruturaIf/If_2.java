package EstruturaIf;

public class If_2 {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoM = 1500.0;
		
//		Boolean movimentaPeloMetadeDoValor = (movimentacaoM * 2) >= emprestimo;
		Boolean tempoDeConta = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMetadeDoValor
//				&& tempoDeConta && temNomeLimpo;
				
				if (((movimentacaoM * 2) >= emprestimo )
						&& tempoDeConta && temNomeLimpo ){
					System.out.println("Empréstimo Liberado!");
				} else {
					System.out.println("Empréstimo não está liberado!");
				}

	}

}
