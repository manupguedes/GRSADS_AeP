package lista01;
import java.util.Scanner;
public class exe13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, c, d, u;

		System.out.println("Némero de até 3 casas deimais: ");
		num = s.nextInt();

		 if (num >= 0 && num <= 999) {
			 c = num / 100;
	         d = (num % 100) / 10;
	         u = num % 10;
	         
	         System.out.println("CENTENA: " + c);
	         System.out.println("DEZENZA: " + d);
	         System.out.println("UNIDADE: " + u);
	         
		 }else {
			 System.out.println("Por favor tente novamente de acordo com os requisitos");
		 }

		 s.close();
	}

}