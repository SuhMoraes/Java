package aula03;

import java.util.Scanner;

public class ex_ImpressaoNomeSobrenome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("NOME E SOBRENOME");
		System.out.println();
		
		System.out.print("Informe o seu nome: ");
		
		String nome = scanner.nextLine();
		
		System.out.print("Agora, informe seu Sobrenome: ");
		
		String sobrenome = scanner.nextLine();
		
		
		System.out.print("Seu nome completo ?: " + nome + " "+ sobrenome);
		
		scanner.close();

	}

}
