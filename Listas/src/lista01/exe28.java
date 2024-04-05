package lista01;
import java.util.Scanner;
public class exe28 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n1, n2, med;
		
		System.out.println("Escreva a nota 1: ");
		n1 = s.nextDouble();
		System.out.println("Escreva a nota 2: ");
		n2 = s.nextDouble();

		med = (n1 * 2) + (n2 * 3) / 6;
		
		System.out.println("Média ponderada: " + med);

		s.close();

	}

}
