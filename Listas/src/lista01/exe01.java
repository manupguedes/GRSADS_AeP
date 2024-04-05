package lista01;
import java.util.Scanner;
public class exe01 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		float lag, alt, area;

		System.out.println("Escreva as dimenções do terreno ");
		System.out.print("Largura: ");
		lag = s.nextFloat();
		System.out.print("Altura: ");
		alt = s.nextFloat();

		area = lag*alt;

		System.out.println("Área do terreno: " + area);

		s.close();

	}

}
