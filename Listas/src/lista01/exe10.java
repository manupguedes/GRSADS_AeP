package lista01;
import java.util.Scanner;
public class exe10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int Ax, Ay, Bx, By, X2, Y2, distancia;

		System.out.print("Informe o valor do A x: ");
		Ax = s.nextInt();
		System.out.print("Informe o valor do A y: ");
		Ay = s.nextInt();
		System.out.print("Informe o valor do B x: ");
		Bx = s.nextInt();
		System.out.print("Informe o valor do B y: ");
		By = s.nextInt();
		
		X2 = (Ax - Bx) * 2;
		Y2 = (Ay - By) * 2;
		distancia = X2 + Y2;

		System.out.println("A distância entre os pontos: X( " + Ax + " , " + Bx + " ) e Y( " + Ay + " , " + By + " )");
		System.out.println("é: " + distancia);

		s.close();

	}

}

