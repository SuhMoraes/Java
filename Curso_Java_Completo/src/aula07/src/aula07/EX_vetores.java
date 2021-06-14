package aula07;

import java.util.Scanner;

// Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele. 
// Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.

public class EX_vetores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] tarefaDoDia = new String[5];
		
		
		for(int i = 0; i < tarefaDoDia.length; i++) {
			System.out.println("Tarefas:  " + i);
			tarefaDoDia[i] = input.nextLine();
		}
		
		System.out.println("As tarefas mais importantes são: ");
		for(int i = 0; i < tarefaDoDia.length; i++) {
			System.out.println(i + ": " + tarefaDoDia[i]);
		}
		input.close();

	}

}
