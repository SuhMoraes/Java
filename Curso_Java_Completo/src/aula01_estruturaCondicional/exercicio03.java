package estruturaCondicional;

// Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
// indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
// ordem crescente ou decrescente.

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % 2 == 0 && B % 2 == 0) {
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		sc.close();
	}

}
