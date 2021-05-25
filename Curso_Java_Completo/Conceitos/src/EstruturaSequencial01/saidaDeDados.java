package EstruturaSequencial01;

public class saidaDeDados {

	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x); // 2 casas decimais
		System.out.printf("%.4f%n", x); // 4 casas decimais
		
		System.out.println("======================================");
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
