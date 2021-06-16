package aula08;

import java.util.Scanner;

// Crie um programa que pe�a dois n�meros do usu�rio e tamb�m qual a opera��o ele deseja fazer - adi��o ou subtra��o. 
// Para cada opera��o, voc� deve construir um m�todo que realize a mesma, ou seja, teremos um m�todo para adi��o, 
// que vai receber dois n�meros como par�metros e retornar o resultado da soma entre eles, e outro m�todo para subtra��o.
//
// Fique a vontade para implementar multiplica��o e divis�o tamb�m

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
		
		System.out.println("O resultado �: " + resultado);
		
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
			System.err.println("Escolha uma opera��o v�lida!");
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
		System.out.println("Informe um n�mero: ");
		return input.nextInt();
	}
	
	static Integer escolhaAOperacao(Scanner input) {
		System.out.println("Escolha a opera��o matem�tica: ");
		
		String[] calculadora = new String[] {" Adi��o ", " Subtra��o ", " Multiplica��o ", " Divis�o "};	
		
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
