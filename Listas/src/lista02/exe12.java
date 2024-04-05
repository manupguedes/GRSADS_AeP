package lista02;
import java.util.Scanner;
public class exe12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double salBruto, ir = 0, inss = 0, fgts = 0, percIr = 0, totDesc = 0, salLiqui =0;
		
		System.out.println("Qual o salario bruto? ");
		salBruto = s.nextDouble();
		
		if (salBruto < 900) {
			percIr = 0;
			ir = salBruto * 0.0;
			
		}else if (salBruto > 899 && salBruto < 1.500) {
			percIr = 5;
			ir = salBruto * 0.05;
			
		}else if (salBruto > 1.499 && salBruto < 2.500) {
			percIr = 10;
			ir = salBruto * 0.10;
			
		}else if (salBruto > 2.499) {
			percIr = 20;
			ir = salBruto * 0.20;
		}
		
		inss = salBruto * 0.10;
		fgts = salBruto * 0.11;
		totDesc = ir + inss + fgts;
		salLiqui = salBruto - totDesc;
		
		System.out.println("Salario bruto: R$" + salBruto);
		System.out.println("IR: (" + percIr + "%): R$" + ir);
		System.out.println("INSS: (10%): R$" + inss);
		System.out.println("FGTS: (11%): R$" + fgts);
		System.out.println("Total de desconto: R$" + totDesc);
		System.out.println("Salario liquido: R$" + salLiqui);
		
		s.close();

	}

}
