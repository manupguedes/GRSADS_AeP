package listaC01;
import java.util.Scanner;
public class exe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int base, alt, area;
		
		System.out.println("Qual a base? ");
		base = s.nextInt();
		System.out.println("Qual a altura? ");
		alt = s.nextInt();
		
		area = base * alt;
		
		System.out.println("A area é: " + area);
		
		s.close();
	}

}
