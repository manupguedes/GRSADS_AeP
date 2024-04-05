package lista01;
import java.util.Scanner;
public class exe14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double rPizza, aPizza;

		System.out.println("Informe o raio da circuferência da pizza: ");
		rPizza = s.nextDouble();

		aPizza = 3.14 * (rPizza * 2);

		System.out.println("A área da pizza é de: " + aPizza);

		s.close();
	}

}