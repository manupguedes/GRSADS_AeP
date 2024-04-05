package lista01;
import java.util.Scanner;
public class exe35 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double diagMaior, diagMenor, area;

		System.out.println("Informe a diagonal maior: ");
		diagMaior = s.nextDouble();
		System.out.println("Informe a diagonal menor: ");
		diagMenor = s.nextDouble();

		area = (diagMaior * diagMenor) / 2;

		System.out.println("A area desse losango é de: " + area);

		s.close();
	}

}
