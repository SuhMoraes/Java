package aula03;

public class aula04_TipoLogico {

	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Vari�vel false: " + variavelFalsa);
		
		System.out.println("-------------------------------------------------");
		
		Integer idade = 15;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira? " + podeTirarCarteira);
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira. ");
			
		} else {
			System.out.println("Infelizmente precisa ser maior de 18 anos para tirar a carteira.");
		}
		
		
		
	}

}
