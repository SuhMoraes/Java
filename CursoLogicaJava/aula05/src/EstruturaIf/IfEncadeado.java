package EstruturaIf;

import java.util.Scanner;

public class IfEncadeado {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu peso: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = (peso <= 60) && (peso > 0);
		Boolean pesoMedio = (peso > 60) && (peso <= 90);
		Boolean pesoPesado = peso > 90;
		
		// forma simplificada
		
		if(pesoLeve) {
			System.out.println("O(A) Lutador(a) � peso leve");
		} else if(pesoMedio) {
			System.out.println("O(A) Lutador(a) � peso M�dio");
		} else if(pesoPesado) {
			System.out.println("O(A) Lutador(a) � peso Pesado.");
		} else {
			System.out.println("O(A) Lutador(a) n�o � leg�vel para nenhuma das moalidades.");
		}

		scanner.close();
	}
}
