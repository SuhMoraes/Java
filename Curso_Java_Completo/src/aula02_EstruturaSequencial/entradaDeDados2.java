package EstruturaSequencial01;

import java.util.Scanner;

public class entradaDeDados2 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2, s3;
		int  x;
		
		x = sc.nextInt();
		sc.nextLine(); // Para a leitura não ficar pendente
		s1 = sc.nextLine(); //Leitura da linha inteira - nextLine()
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}


