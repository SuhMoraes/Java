package aula07;

public class vetores1Dimensao2 {
	
	
	// TROCANDO O SABOR DA PIZZA
		public static void main(String[] args) {
			String[] cardapio = new String[] {"Calabresa", "Marguerita", "Quatro Queijos", "Portuguesa"};
			
			cardapio[3] = "Catupiry";
			for(int i = 0; i < cardapio.length; i++) {
				System.out.println(cardapio[i]);
			}
		}
		
		
}
