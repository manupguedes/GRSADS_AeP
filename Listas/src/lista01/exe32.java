package lista01;
import java.util.Scanner;
public class exe32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double pesoKg, pesoG;

		System.out.println("Qual o peso da pessoa? ");
		pesoKg = s.nextDouble();

		pesoG = pesoKg * 1000;

		System.out.println("O peso em Kg: " + pesoKg + " o peso em gramas: " + pesoG);

		s.close();

	}

}
