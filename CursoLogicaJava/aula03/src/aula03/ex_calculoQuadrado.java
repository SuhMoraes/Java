package aula03;

import java.util.Scanner;

public class ex_calculoQuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULANDO O QUADRADO DE UM N?MERO");
		System.out.println();
		
		System.out.print("Informe um n?mero: ");
		Integer numero = scanner.nextInt();
		
		Integer resultado = numero * numero;
		
		System.out.println("O resultado de " + numero + " ? " + resultado);
	}

}
