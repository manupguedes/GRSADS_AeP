package lista02;
import java.util.Scanner;
public class exe19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num, c, d, u;

		System.out.println("Digite um número (menor que 1000): ");
		num = s.nextInt();
		
		 if (num >= 0 && num <= 999) {
			 c = num / 100;
	         d = (num % 100) / 10;
	         u = num % 10;
	         
	         System.out.println("CENTENA: " + c + ", DEZENA: " + d + ", UNIDADE: " + u);
		 }else {
			 System.out.println("Por favor tente novamente de acordo com os requisitos");
		 }
		 s.close();

	}

}
