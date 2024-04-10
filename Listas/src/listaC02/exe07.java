package listaC02;
import java.util.Scanner;
public class exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double sal, valorEmprestimo, valorParcela, limiteParcela;
		int parcelas;
		
		System.out.println("Digite o valor do salário: ");
        sal = s.nextDouble();
        System.out.println("Digite o valor do empréstimo solicitado: ");
        valorEmprestimo = s.nextDouble();
        System.out.println("Digite a quantidade de parcelas desejadas: ");
        parcelas = s.nextInt();

        valorParcela = valorEmprestimo / parcelas;
        limiteParcela = sal * 0.30;

        if (valorParcela > limiteParcela) {
            System.out.println("Crédito negado.");
        } else {
            System.out.println("Crédito aprovado.");
            System.out.println("Valor do empréstimo solicitado: R$ " + valorEmprestimo);
            System.out.println("Quantidade de parcelas: " + parcelas);
            System.out.println("Valor de cada parcela: R$ " + valorParcela);
        }
		s.close();
	}

}
