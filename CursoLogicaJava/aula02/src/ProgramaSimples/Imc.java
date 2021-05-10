package ProgramaSimples;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		System.out.println( );
		
		System.out.print("Informe o seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Informe a sua altura: ");
		Double altura =  scanner.nextDouble();
		
		Double resultado =  peso / (altura * altura);
		
		System.out.println("Resultado da sua massa corporal é: " + resultado);	
				
		
		scanner.close();
	}

}
