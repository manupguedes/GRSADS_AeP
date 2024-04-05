package lista01;
import java.util.Scanner;
public class exe39 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salJ, C1 = 200, C2 = 120, restSalJ;

		System.out.println("Qual o salario do Joao? ");
		salJ = s.nextDouble();
		
		restSalJ = salJ - (C1 + C1 * 0.02) - (C2 + C2 * 0.02);

		System.out.println("O Restante do salario do Joao é de: R$" + restSalJ);

		s.close();
	}

}
