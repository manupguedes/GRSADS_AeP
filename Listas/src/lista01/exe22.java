package lista01;
import java.util.Scanner;
public class exe22 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int qtde1cent, qtde5cent, qtde10cent, qtde25cent, qtde50cent, qtde1real;
		double total;
		
        System.out.println("Quantas moedas de 1 centavo tem?");
        qtde1cent = s.nextInt();
        System.out.println("Quantas moedas de 5 centavo tem?");
        qtde5cent = s.nextInt();
        System.out.println("Quantas moedas de 10 centavo tem?");
        qtde10cent = s.nextInt();
        System.out.println("Quantas moedas de 25 centavo tem?");
        qtde25cent = s.nextInt();
        System.out.println("Quantas moedas de 50 centavo tem?");
        qtde50cent = s.nextInt();
        System.out.println("Quantas moedas de 1 real tem?");
        qtde1real = s.nextInt();
        
        total = ((qtde1cent * 0.01) + (qtde5cent * 0.05) + (qtde10cent * 0.1) + (qtde25cent * 0.25) + (qtde50cent * 0.5) + qtde1real);

        System.out.println("Foram guardados " + total + " Reais");

        s.close();
	}

}
