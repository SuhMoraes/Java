package bibliotecaemail;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		Carteiro.enviar("usersend@gmail.com", "Aula de envio de e-mail", "Parab�ns voc� conseguiu :-)");
		
		System.out.println("Fim!");

	}

}
