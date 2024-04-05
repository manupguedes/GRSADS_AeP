package listaC01;
import java.util.Scanner;
public class exe05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double sal, perc, novoSal;

		System.out.println("Qual o seu salario? ");
		sal = s.nextDouble();
		System.out.println("Qual o percentual? ");
		perc = s.nextDouble();
		
		novoSal = sal * (perc/100) + sal;
		
		System.out.println("O novo salario é: R$" + novoSal);

		s.close();
	}

}
