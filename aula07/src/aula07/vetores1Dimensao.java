package aula07;

import java.util.Scanner;

public class vetores1Dimensao {

	public static void main(String[] args) {
		String[] cardapio = new String[] {"Calabresa", "Marguerita", "Quatro Queijos", "Portuguesa"};
		 System.out.println("Escolha o sabor: ");
		 
		 for(int i = 0; i < cardapio.length; i++) {
			 System.out.println("[" + i  + "] " + cardapio[i]);
		 }
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Digite o número referente ao sabor: ");
		 Integer saborEscolhido = input.nextInt();
		 
		 System.out.println("O sabor escolhido foi: " + cardapio[saborEscolhido]);
		 
		 input.close();
	}
}

