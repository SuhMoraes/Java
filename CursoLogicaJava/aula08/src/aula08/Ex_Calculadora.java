package aula08;

import java.util.Scanner;

// Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração. 
// Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição, 
// que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
//
// Fique a vontade para implementar multiplicação e divisão também

public class Ex_Calculadora {

	public static void main(String[] argso) {
		Scanner input = new Scanner(System.in);	
	
		
		imprimirTraco();
		
		calculadora(" Calculadora ");
		
		imprimirTraco();		
		
		Integer escolhaUmNumero = informeNumero(input);
		
		imprimirTraco();
		
		Integer operacaoMatematica = escolhaAOperacao(input);

		imprimirTraco();		
		
		
		Integer escolhaOutroNumero = informeNumero(input);	

		imprimirTraco();			

		
		Integer resultado = realizarCalculo(operacaoMatematica,  escolhaUmNumero,  escolhaOutroNumero);
		
		System.out.println("O resultado é: " + resultado);
		
		input.close();
	}
	
	


	static Integer realizarCalculo(Integer calculadora, Integer escolhaUmNumero, Integer escolhaOutroNumero) {
		Integer resultado = null;
		
		switch (calculadora) {
		case 0:
			resultado = adicao(escolhaUmNumero, escolhaOutroNumero);
			break;
		case 1:
			resultado = subtracao(escolhaUmNumero, escolhaOutroNumero);
			break;
		case 2:
			resultado = multiplicacao(escolhaUmNumero, escolhaOutroNumero);
			break;
		case 3:
			resultado = divisao(escolhaUmNumero, escolhaOutroNumero);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}
		
		return resultado;
	}
	
	
	static Integer adicao(Integer escolhaUmNumero, Integer escolhaOutroNumero) {
		
		return escolhaUmNumero + escolhaOutroNumero;
	}
	
	
	static Integer subtracao(Integer escolhaUmNumero, Integer escolhaOutroNumero) {
		return escolhaUmNumero - escolhaOutroNumero;
	}
	
	
	static Integer multiplicacao(Integer escolhaUmNumero, Integer escolhaOutroNumero) {
		return escolhaUmNumero * escolhaOutroNumero;
	}
	
	
	static Integer divisao(Integer escolhaUmNumero, Integer escolhaOutroNumero) {
		return escolhaUmNumero / escolhaOutroNumero;
	}
	
	
	static Integer informeNumero(Scanner input) {
		System.out.println("Informe um número: ");
		return input.nextInt();
	}
	
	static Integer escolhaAOperacao(Scanner input) {
		System.out.println("Escolha a operação matemática: ");
		
		String[] calculadora = new String[] {" Adição ", " Subtração ", " Multiplicação ", " Divisão "};	
		
		for(int i = 0; i < calculadora.length; i++) {
			System.out.println("[" + i + "]" + calculadora[i]);
		}
		return input.nextInt();
			
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void calculadora(String titulo) {
		System.out.println(titulo);
	}

	static void imprimirTraco() {
		imprimir("------------------------------");
	}
	

	
}
