package lista01;
import java.util.Scanner;
public class exe40 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double C1, C2, hip2, hip;

		System.out.println("Qual o Cateto 1 do triangulo? ");
		C1 = s.nextDouble();
		System.out.println("Qual o Cateto 2 do triangulo? ");
		C2 = s.nextDouble();

		hip2 = (C1 * 2) + (C2 * 2);
		hip = Math.sqrt(hip2);

		System.out.println("O valor da hipotenusa desse triangulo é: " + hip);

		s.close();
	}

}
