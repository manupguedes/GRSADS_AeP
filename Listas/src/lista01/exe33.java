package lista01;
import java.util.Scanner;
public class exe33 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double BM, bm, alt, area;

		System.out.println("Informe a base maior: ");
		BM = s.nextDouble();
		System.out.println("Informe a base menor: ");
		bm = s.nextDouble();
		System.out.println("Informe a altura: ");
		alt = s.nextDouble();

		area = (BM + bm) * alt / 2;

		System.out.println("A area do trapezio é: " + area);

		s.close();
	}

}
