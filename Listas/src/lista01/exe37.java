package lista01;
import java.util.Scanner;
public class exe37 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, i;

		System.out.println("Escreva um numero para mostrar a tabuada");
		num = s.nextInt();

		for (i = 0; i < 11; i++) {
			System.out.println(i + " X " + num + ": " + (num * i));		}

		s.close();
	}

}
