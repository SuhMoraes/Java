package aula03;

import java.util.Scanner;

public class Aula03_TipoTexto2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.println("Ol? " + nome + ", seja muito bem vindo!");
		
		scanner.close();
		
		Character variavelChar = 'C';
		
		System.out.println(variavelChar);
	}

}
