//Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
//Serão dois parâmetros para receber um para receber a nota de português e outro para receber as 
//de matemática.
//
//A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar 
//é igual ou maior que 150. 
//Entretanto, o candidato não pode tirar menos do que 60 pontos 
//em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática 
//(totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
//No final mostre para o candidato se ele conseguiu ou não.

package EstruturaIf;

import java.util.Scanner;

public class exercicios_if {

	static final Double NOTA_CLASSIFICATORIA_GERAL = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Português: "); 
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matemática: "); 
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_CLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println("Parabéns! Você passou.");
		} else {
			System.out.println("Infelizmente, não foi dessa vez.");
		}
		
		scanner.close();


	}

}
