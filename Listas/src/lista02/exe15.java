package lista02;
import java.util.Scanner;
public class exe15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double lado1, lado2, lado3;
		
		System.out.println("Qual a medida do lado 1 do triangulo? ");
		lado1 = s.nextDouble();
		System.out.println("Qual a medida do lado 2 do triangulo? ");
		lado2 = s.nextDouble();
		System.out.println("Qual a medida do lado 3 do triangulo? ");
		lado3 = s.nextDouble();
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("esse é um triangulo EQUILATERO");
		}else if  (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
		s.close();
	}

}
