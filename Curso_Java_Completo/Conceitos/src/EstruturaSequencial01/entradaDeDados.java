package EstruturaSequencial01;

import java.util.Scanner;

public class entradaDeDados {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char d;
		
		System.out.print("Digite uma palavra: ");
		// Comando para ler um string
		x = sc.next();
		
		System.out.print("Digite um número: ");
		// Comando para ler um número
		y = sc.nextInt();
		
		System.out.print("Digite um valor: ");
		// Comando para ler um ponto flutuante
		z = sc.nextDouble();
		
		System.out.print("Digite uma letra: ");
		d = sc.next().charAt(0);
		
		
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.printf("Você digitou: %.2f%n", z);
		System.out.print("Digite uma letra: " + d);

		
		
		sc.close();
	}
}
