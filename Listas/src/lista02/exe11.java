package lista02;
import java.util.Scanner;
public class exe11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double salAnt, salNov, vlrAument;
		int perc;
		
		System.out.println("qual o salario do funcionario? ");
		salAnt = s.nextFloat();
		
		if (salAnt < 280) {
			vlrAument = salAnt * 0.20;
			salNov = salAnt + vlrAument;
			perc = 20;
			
		}else if (salAnt > 279 && salAnt < 700) {
			vlrAument = salAnt * 0.15;
			salNov = salAnt + vlrAument;
			perc = 15;
			
		}else if (salAnt > 699 && salAnt < 1.500) {
			vlrAument = salAnt * 0.10;
			salNov = salAnt + vlrAument;
			perc = 10;
			
		}else {
			vlrAument = salAnt * 0.05;
			salNov = salAnt + vlrAument;
			perc = 5;
		}

		System.out.println("Salario sem reajuste: R$" + salAnt);
		System.out.println("Percentual: " + perc + "%");
		System.out.println("Valor do aumento: R$" + vlrAument);
		System.out.println("Salario novo: R$" + salNov);
		
		s.close();
	}

}
