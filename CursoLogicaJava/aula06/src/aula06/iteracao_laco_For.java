package aula06;

public class iteracao_laco_For {

	public static void main(String[] args) {
//		for(int i = 1; i <= 5; i++) {
//		System.out.println(i + ": Aprendendo o laço for.");
//	} 
		
		
//	  Simulação o valor total de uns itens que estão no carrinho
//		
//		Double[] carrinhoDeCompras = new Double[]{101.00, 245.00, 99.00};
//		Double total = 0.00;
//		
//		for(int i = 0; i < carrinhoDeCompras.length; i++) {
//			System.out.println(i + " Total: " + total);
//			total += carrinhoDeCompras[i];
//		}
//		
//		System.out.println("O valor total é de: " + total);
//	}
		
		
//		// Utilizacao do break dentro da estrutura FOR
//		
//		for(int i = 0; i < 10; i++) {
//			if(i == 5) {
//				
////				System.out.println("OVER!");
////				break;
//				
//				System.out.println("TO BE CONTINUED!");
//				continue;
//			}
//			
//			System.out.println("Interação: " + i);
//		}
		
		Integer[] produtosCode = new Integer[] {100, 225, 300};
		for (int i = 0; i < produtosCode.length; i++) {
			
			Integer produto = produtosCode[i];
			
			 System.out.println("Produto de código: " + produto);
			 
			 if(produto.equals(225)) {
				 System.out.println("Produto Encontrado!");
				 break;
			 }
		}
		
	}
}
