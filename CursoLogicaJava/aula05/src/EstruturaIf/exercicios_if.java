//Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
//Ser?o dois par?metros para receber um para receber a nota de portugu?s e outro para receber as 
//de matem?tica.
//
//A prova, no total, vale 200 pontos - 100 para cada mat?ria. A nota m?nima total para passar 
//? igual ou maior que 150. 
//Entretanto, o candidato n?o pode tirar menos do que 60 pontos 
//em qualquer uma das duas mat?rias, ou seja, se tirar 59 em portugu?s e 100 em matem?tica 
//(totalizando uma nota maior do que o total necess?rio que ? 150) ele n?o conseguir? a vaga.
//No final mostre para o candidato se ele conseguiu ou n?o.

package EstruturaIf;

import java.util.Scanner;

public class exercicios_if {

	static final Double NOTA_CLASSIFICATORIA_GERAL = 150.0;
	
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("VERIFICANDO SE TEM NOTA SUFICIENTE PARA CONCURSO.");
		
		System.out.print("Portugu?s: "); 
		Double notaDePortugues = scanner.nextDouble();
		
		System.out.print("Matem?tica: "); 
		Double notaDeMatematica = scanner.nextDouble();
		
		Boolean estaAcimaDoMinimoEmPortugues = notaDePortugues >= NOTA_MINIMA;
		
		Boolean estaAcimaDoMinimoEmMatematica = notaDeMatematica >= NOTA_MINIMA;
		
		Double notaTotal = notaDePortugues + notaDeMatematica;
		
		Boolean temNotaParaPassar = notaTotal >= NOTA_CLASSIFICATORIA_GERAL;
		
		Boolean passou = temNotaParaPassar && estaAcimaDoMinimoEmPortugues && estaAcimaDoMinimoEmMatematica;

		if (passou) {
			System.out.println("Parab?ns! Voc? passou.");
		} else {
			System.out.println("Infelizmente, n?o foi dessa vez.");
		}
		
		scanner.close();


	}

}
