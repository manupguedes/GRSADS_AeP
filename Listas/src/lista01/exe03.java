package lista01;
import java.util.Scanner;
public class exe03 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		int pao, broa;
		double vlrPao, vlrBroa, vlrPB, vlrPou;

		System.out.println("Qual a quantiidade de pães franceses que foram vendidos?");
		pao = s.nextInt();
		System.out.println("Qual a quantidade de pães broas que foram vendidos?");
		broa = s.nextInt();

		vlrPao = 0.12;
		vlrBroa = 1.50;

		vlrPB = (pao * vlrPao) + (broa * vlrBroa);
		vlrPou = vlrPB * 0.10;

		System.out.println("O valor total dos pães vendidos: R$" + vlrPB);
		System.out.println("O valor que foi para a poupança: R$" + vlrPou);

		s.close();
		
	}
	
}