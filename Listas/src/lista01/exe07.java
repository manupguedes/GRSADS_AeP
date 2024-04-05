package lista01;
import java.util.Scanner;
public class exe07 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		int mes, dia, dias;

		System.out.println("Me fala o dia da data escolhida: ");
		dia = s.nextInt();
		System.out.println("Me fala o mês da data escolhida: ");
		mes = s.nextInt();

		dias = (mes * 30) - (30 - dia);

		System.out.println("Passaram " + dias + " dias do começo do ano ate esse data");

		s.close();

	}
	
}

