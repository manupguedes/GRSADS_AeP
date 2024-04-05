package listaC01;
import java.util.Scanner;
public class exe01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int num, ant;
		
		System.out.println("Escreva um valor: ");
		num = s.nextInt();
		
		ant = num - 1;
		
		System.out.println("O antecessor é: " + ant);
		
		s.close();
	}

}
