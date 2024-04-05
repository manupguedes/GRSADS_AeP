package lista01;
import java.util.Scanner;
public class exe31 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double peso, peso15, peso20;

		System.out.println("Qual o peso da pessoa? ");
		peso = s.nextDouble();

		peso15 = peso + (peso * 0.15);
		peso20 = peso - (peso * 0.20);

		System.out.println("Se a pessoa engordar 15% do peso atual dela ela fiará com: " + peso15 + "kg");
		System.out.println("Se a pessoa emagrecer 20% do peso atual dela ela fiará com: " + peso20 + "kg");

		s.close();

	}

}
