package listaC02;
import java.util.Scanner;
public class exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String nome, senha;
		
		System.out.println("Qual o seu nome? ");
		nome = s.next();
		System.out.println("Qual a senha? ");
		senha = s.next();
		
		if (nome.equals("adim") && senha.equals("12345")) {
			System.out.println("Acesso Permitido");
		}else {
			System.out.println("Acesso negado");
		}
		
		s.close();
	}

}
