package EstruturaSequencial01;

import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e
// depois mostrar na tela a soma desses números com uma
// mensagem explicativa

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		
		
	}

}
