package aula03;

import java.util.Scanner;

public class ex_PassouDeAnoOuNao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("----------------------------------------");
		System.out.println("-----------ESCOLA PARA TODOS------------");		
		System.out.println("----------------------------------------");
		
		System.out.println("Infome as notas");
		
		System.out.print("Nota 1: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.print("Nota 2: ");
		Double nota2 = scanner.nextDouble();
		
		System.out.print("Nota 3: ");
		Double nota3 = scanner.nextDouble();
		
		System.out.print("Nota 4: ");
		Double nota4 = scanner.nextDouble();		
		
		Double nota =  (nota1 + nota2 + nota3 + nota4)/ 4;
		
		
		Boolean passouDeAno = nota >= 7;
		
		if(passouDeAno) {
			System.out.println("Parab�ns! Voc� passou de ano!");
		} else {
			System.out.println("Precisa estudar mais, por isso foi REPROVADO!");
		}
	}

}
