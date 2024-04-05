package lista02;
import java.util.Scanner;
public class exe06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1, n2, n3, maior;
		
		System.out.println("Escreva um número: ");
		n1 = s.nextInt();
		System.out.println("Escreva outro número: ");
		n2 = s.nextInt();
		System.out.println("Escreva outro número: ");
		n3 = s.nextInt();
		
		maior = n1;
		
		 if (n2 > maior) {
	         maior = n2;
	        }
	        if (n3 > maior) {
	            maior = n3;
	        }

	        System.out.println("O maior número é: " + maior);

	        s.close();
	}

}
