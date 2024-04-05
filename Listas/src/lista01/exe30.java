package lista01;
import java.util.Scanner;
public class exe30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double salF,comisVenda, comis, salFinal;

		System.out.println("Qual o valor do salario fixo do funcionario? ");
		salF = s.nextDouble();
		System.out.println("Qual o valor da comissão de venda? ");
		comisVenda = s.nextDouble();

		comis = comisVenda * 0.04;
		salFinal = salF + comis;

		System.out.println("O salario final do funcioario é de: R$" + salFinal);

		s.close();
	}

}
