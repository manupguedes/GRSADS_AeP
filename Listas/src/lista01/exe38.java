package lista01;
import java.util.Scanner;
public class exe38 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int anoAtual, anoNasc, anos, dias, meses, semanas;

		System.out.println("qual o ano de hoje? ");
		anoAtual = s.nextInt();
		System.out.println("Qual o ano voce nasceu? ");
		anoNasc = s.nextInt();

		anos = anoAtual - anoNasc;
		meses = anos * 12;
		dias = anos * 360;
		semanas = anos * 52;

		System.out.println("Quantidade de anos: " + anos);
		System.out.println("Quantidade de mes: " + meses);
		System.out.println("Quantidade de semanas: " + semanas);
		System.out.println("Quantidade de dias: " + dias);

		s.close();

	}

}
