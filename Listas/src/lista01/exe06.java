package lista01;
import java.util.Scanner;
public class exe06 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		int peso;
		float vlrPagar;

		System.out.println("Qual o peso do seu prato? EM KILO ");
		peso = s.nextInt();

		vlrPagar = peso * 12;

		System.out.println("O valor a ser pago será: R$" + vlrPagar);

		s.close();
		
	}

}
