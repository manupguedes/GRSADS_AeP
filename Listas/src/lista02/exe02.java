package lista02;
import java.util.Scanner;
public class exe02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1;
		
		System.out.println("Escreva um número: ");
		n1 = s.nextInt();
		
		if (n1 < 0){
			System.out.println("esse número é NEGATIVO");
		}else {
			System.out.println("esse número é POSITIVO");
		}
		s.close();
	}

}
