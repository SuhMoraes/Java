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
		
		System.out.print("Digite um n�mero: ");
		// Comando para ler um n�mero
		y = sc.nextInt();
		
		System.out.print("Digite um valor: ");
		// Comando para ler um ponto flutuante
		z = sc.nextDouble();
		
		System.out.print("Digite uma letra: ");
		d = sc.next().charAt(0);
		
		
		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou: " + y);
		System.out.printf("Voc� digitou: %.2f%n", z);
		System.out.print("Digite uma letra: " + d);

		
		
		sc.close();
	}
}
