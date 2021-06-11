package aula06;

public class iteracao_laco_while {

	public static void main(String[] args) {
		for(Integer i = 0; i < 10; i++) {
			System.out.println("Iteração: " + i);
		}
		
		Integer indice = 0;
		while(indice < 10) {
			System.out.println(indice + ": Iteração com While");
			indice ++;
		}
		
		// Com comando Break
		
		int A = 0;
		while (A < 10) {
			if(A == 5 ) {
				System.out.println("Vai Continuar...");
				break;
			}
			
			System.out.println(A + ": Com o comando BREAK.");
			A++;
		}
		
		// Com o comando Contiune
		
		int b = 0;
		while (b < 10) {
			if(b == 5 ) {
				System.out.println("Vai Continuar...");
				// Só vai parar após a declaração do incremento
				// Retirando o incremento, entra no Loop Infinito
				b++;
				continue;
			}
			
			System.out.println(b + ": Com o comando CONTINUE.");
			b++;
		}
	}

}
