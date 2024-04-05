package lista01;
import java.util.Scanner;
public class exe04 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		String nome;
		int idade, ano = 365, diasvida;

		System.out.println("Qual o seu nome? ");
		nome = s.next();
		System.out.println("Qual a sua idade? ");
		idade = s.nextInt();

		diasvida = ano * idade;

		System.out.println(nome + " você tem " + diasvida + " de vida!");

		s.close();

	}

}

