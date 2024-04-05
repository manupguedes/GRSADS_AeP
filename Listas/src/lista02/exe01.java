package lista02;
import java.util.Scanner;
public class exe01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1, n2;
		
		System.out.println("Escreva um número: ");
		n1 = s.nextInt();
		System.out.println("Escreva outro número: ");
		n2 = s.nextInt();
		
		if (n1 < n2) {
			System.out.println("O maior número é " + n2);
		}else {
			System.out.println("O maior numero é " + n1);
		}
		s.close();
	}

}
