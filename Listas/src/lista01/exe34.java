package lista01;
import java.util.Scanner;
public class exe34 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double lado, area;

		System.out.println("Qual o valor do lado do quadrado? ");
		lado = s.nextDouble();

		area = lado * lado;

		System.out.println("A area do quadrado é de: " + area);

		s.close();

	}

}
