package lista01;
import java.util.Scanner;
public class exe15 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int vlrParcelaAC;
		double vlrParcelaF, vlrTotal;

		System.out.println("Qual o valor total da conta do bar? ");
		vlrTotal = s.nextDouble();

		vlrParcelaAC = (int) vlrTotal / 3;
		vlrParcelaF = vlrTotal - 2 * vlrParcelaAC;

		System.out.println("Felipe irá pagar: R$" + vlrParcelaF);
		System.out.println("Andre e Carlos iram pagar cada um: R$" + vlrParcelaAC);

		s.close();

	}

}