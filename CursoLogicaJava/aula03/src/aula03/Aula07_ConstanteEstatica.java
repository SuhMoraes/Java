package aula03;

import java.util.Scanner;

public class Aula07_ConstanteEstatica {

	static final Integer IDADE_MINIMA_PARA_CNH = 18;
	
	public static void main(String[] args) {	
			Scanner scanner = new Scanner(System.in);			
			
			System.out.print("Idade: ");
			Integer idade = scanner.nextInt();
			
			Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_CNH;
			
			if (podeTirarCarteira) {
				System.out.println("Est� apto! Voc� j� tem idade suficiente para tirar a CNH.");
			} else {
				System.out.println("N�o est� apto! Voc� dever� ter 18 anos para tirar a CNH.");
			}
			scanner.close();
	}
}
