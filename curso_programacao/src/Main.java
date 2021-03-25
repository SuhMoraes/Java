import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		 int y = 32;
		 double x = 10.72548845;
		 
		 String nome = "MAria";
		 int idade = 31;
		 double renda = 4000.0;
		 
		System.out.println(x);
		
		Locale.setDefault(Locale.US);
	    System.out.println(y);
		System.out.println("Vou ficar muito bom em JAVA!");
		System.out.printf("", x);
		System.out.printf("%.4f%n", x); 
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO =  %.2f  METROS%n", x);
		
	
		System.out.printf("%s tem %1  d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
