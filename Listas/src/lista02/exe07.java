package lista02;
import java.util.Scanner;
public class exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

int n1, n2, n3, maior, menor;
		
		System.out.println("Escreva um número: ");
		n1 = s.nextInt();
		System.out.println("Escreva outro número: ");
		n2 = s.nextInt();
		System.out.println("Escreva outro número: ");
		n3 = s.nextInt();
		
		maior = n1;
		menor = n1;
		
		 if (n2 > maior) {
	         maior = n2;
	        }
	        if (n3 > maior) {
	            maior = n3;
	        }

	        if (n2 < menor) {
	            menor = n2;
	        }
	        if (n3 < menor) {
	            menor = n3;
	        }

	        System.out.println("O maior número é: " + maior);
	        System.out.println("O menor número é: " + menor);

	        s.close();
	}

}
