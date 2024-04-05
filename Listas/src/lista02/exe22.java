package lista02;
import java.util.Scanner;
public class exe22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = s.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		s.close();
	}

}
