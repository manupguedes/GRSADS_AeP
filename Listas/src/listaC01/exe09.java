package listaC01;
import java.util.Scanner;

public class exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double n1, n2, n3, media;
		
		System.out.println("Nota 01: ");
		n1 = s.nextDouble();
		System.out.println("Nota 02: ");
		n2 = s.nextDouble();
		System.out.println("Nota 03: ");
		n3 = s.nextDouble();
		
		media = (n1 * 2 + n2 * 3 + n3 * 5) / 5;
		
		System.out.println("A média é: " + media);
		
		s.close();
	}

}
