package aula03;

import java.util.Scanner;

public class contantes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer idadeMinimaParaCNH = 18;
		
		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();
		
		Boolean podeTirarCarteira = idade >= idadeMinimaParaCNH;
		
		if (podeTirarCarteira) {
			System.out.println("Está apto! Você já tem idade suficiente para tirar a CNH.");
		} else {
			System.out.println("Não está apto! Você deverá ter 18 anos para tirar a CNH.");
		}
		scanner.close();
	}

}
