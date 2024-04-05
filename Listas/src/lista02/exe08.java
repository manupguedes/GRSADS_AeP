package lista02;
import java.util.Scanner;
public class exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float preco1, preco2, preco3, barato;
		
		System.out.println("Qual o primeiro valor?");
		preco1 = s.nextFloat();
		System.out.println("Qual o segundo valor?");
		preco2 = s.nextFloat();
		System.out.println("Qual o terceiro valor?");
		preco3 = s.nextFloat();
		
		barato = preco1;
		
		if (preco2 < barato) {
	         barato = preco2;
	        }
	        if (preco3 < barato) {
	            barato = preco3;
	        }
		System.out.println("O valor mais barato é R$" + barato);
		
		s.close();

	}

}
