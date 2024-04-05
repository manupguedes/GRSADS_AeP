package lista01;
import java.util.Scanner;
public class exe27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1, n2, div;

		System.out.println("Escreva um numero: ");
		n1 = s.nextInt();
		System.out.println("Escreva outro numero (NÃO PODE SER ZERO): ");
		n2 = s.nextInt();
		
		div = n1 / n2;

		System.out.println("O valor da divisão é de : " + div);

		s.close();

	}

}
