package estruturaCondicional;

import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

public class exercicio01 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int negativo = sc.nextInt();		 
		 
		 if (negativo < 0) {
			 System.out.println("NEGATIVO");
		 } else {
			 System.out.println("POSITIVO");
		 }	
		 
		 sc.close();	 
	}

}
