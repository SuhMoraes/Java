package EstruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo, 
// e depois mostrar o valor da área deste círculo com quatro
// casas decimais 

// Fórmula da área: area = π . raio2

// Considere o valor de π = 3.14159

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double formArea = pi * Math.pow(raio, 2.0);
		
		System.out.printf("A = %.4f%n", formArea);
		sc.close();
	}

}
