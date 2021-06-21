package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("dev.suhmoraes@gmail.com", "Aula de envio de e-mail", "Parabéns você conseguiu :-)");
		
		System.out.println("Fim!");

	}

}
