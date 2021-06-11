package aula06;

//Dada a lista de números abaixo:
//
//Integer[] numeros = new Integer[] 
//		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//
//... Itere por essa lista e imprima todos os números que são divisíveis por 3.
//
//Para descobrir se um número é divisível por 3, você pode utilizar o operador módulo.
//Toda vez que o módulo de um número por 3 for igual a zero, então esse número e
//divisível por 3.

public class Ex_Iteracao_While {

	public static void main(String[] args) {
		
		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 };
		
		int i = 0;
		while(i < numeros.length) {
			int numero = numeros[i];
			Integer divisivelPorTres = numero % 3;
			
			if(divisivelPorTres.equals(0)) {
				System.out.println("Número " + numero + " é divível por 3.");
			}
			
			i++;
			
		}
	}

}
