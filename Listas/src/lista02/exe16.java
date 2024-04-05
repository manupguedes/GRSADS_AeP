package lista02;
import java.util.Scanner;
public class exe16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double a, b, c, delta, raiz, raiz1, raiz2;
		
		System.out.println("Digite o valor de a: ");
        a = s.nextDouble();

        if (a == 0) {
            System.out.println("A equação não é do segundo grau.");
            return;
        }

        System.out.println("Digite o valor de b: ");
        b = s.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = s.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
	}

}
