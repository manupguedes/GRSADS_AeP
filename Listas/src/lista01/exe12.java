package lista01;
import java.util.Scanner;
public class exe12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double sal, sal15, sal8;

		System.out.println("Qual o seu sálario atual? ");
		sal = s.nextDouble();

		sal15 = sal + (sal * 0.15);
		sal8 = sal15 - (sal15 * 0.08);

		System.out.println("Seu salário com os 15% de acrescimo fica de: R$" + sal15);
		System.out.println("Seu salário com os 08% de desconto fica de: R$" + sal8);

		s.close();

	}

}