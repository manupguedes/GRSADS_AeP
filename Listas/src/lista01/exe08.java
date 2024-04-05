package lista01;
import java.util.Scanner;
public class exe08 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		double n1, n2, n3, med;

		System.out.println("Escreva a nota 1: ");
		n1 = s.nextDouble();
		System.out.println("Escreva a nota 2: ");
		n2 = s.nextDouble();
		System.out.println("Escreva a nota 3: ");
		n3 = s.nextDouble();

		med = (n1 * 1) + (n2 * 2) + (n3 * 3) / 6;

		System.out.println("Média ponderada: " + med);
		
		s.close();

	}

}