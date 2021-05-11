package aula04;

import java.util.Scanner;

public class Ex_Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--------------------------------");
		System.out.println("-------Calculadora em Java------");
		System.out.println("--------------------------------");
		
		System.out.print("Digite um número: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("[ 1 = + | 2 = - | 3 = * | 4 = /] - Escolha qual a operação: ");
		Integer operacao = scanner.nextInt();
		
		System.out.print("Digite outro número: ");
		Double numero2 = scanner.nextDouble();
		
		Double resultado = null;
		
		
	if(operacao.equals(1)){
		resultado = numero1 + numero2;
	}
	
	if(operacao.equals(2)){
		resultado = numero1 - numero2;
	}
	if(operacao.equals(3)) {
		resultado = numero1 * numero2;
	}
	
	if(operacao.equals(4)) {
		resultado = numero1 * numero2;
	}
	
	System.out.println("Resultado: " + resultado);
	
	scanner.close();

	}

	
}
