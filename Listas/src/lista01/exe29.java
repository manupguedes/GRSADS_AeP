package lista01;
import java.util.Scanner;
public class exe29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double precoAnt, precoNov;

		System.out.println("Qual era o valor anterior do produto? ");
		precoAnt = s.nextDouble();

		precoNov = precoAnt - (precoAnt * 0.10);

		System.out.println("O valor novo do produto é de: R$" + precoNov);

		s.close();

	}

}
