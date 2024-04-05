package lista01;
import java.util.Scanner;
public class exe36 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double salMin, salFunc, qntdSalMin;

		System.out.println("Qual o salario minimo de hoje:");
		salMin = s.nextDouble();
		System.out.println("Qual o salario do funcionario:");
		salFunc = s.nextDouble();

		qntdSalMin = (salFunc / salMin);

		System.out.println("A quantidade de salarios minimos são: " + qntdSalMin);

		s.close();

	}

}
