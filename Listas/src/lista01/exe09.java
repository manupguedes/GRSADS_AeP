package lista01;
import java.util.Scanner;
public class exe09 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		int vlrBlusas, tamP, tamM, tamG;
		int vlrTotP, vlrTotM, vlrTotG;

		System.out.println("Quantas blusas tamanho P vai querer? ");
		tamP = s.nextInt();
		System.out.println("Quantas blusas tamanho M vai querer? ");
		tamM = s.nextInt();
		System.out.println("Quantas blusas tamanho G vai querer? ");
		tamG = s.nextInt();

		vlrTotP = tamP * 10;
		vlrTotM = tamM * 12;
		vlrTotG = tamG * 15;
		vlrBlusas = vlrTotP + vlrTotM + vlrTotG;

		System.out.println("O valor total arrecadado é: R$" + vlrBlusas);

		s.close();

	}

}