package listaC02;
import java.util.Scanner;
public class exe10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int qntd;
		double valorUnic, desconto = 0, valorDesconto, valorTotal;
		System.out.println("Digite a quantidade do produto: ");
        qntd = s.nextInt();
        System.out.println("Digite o valor unitário do produto: ");
        valorUnic = s.nextDouble();

        if (qntd > 20) {
            desconto = 0.15;
        } else if (qntd > 15) {
            desconto = 0.13;
        } else if (qntd > 10) {
            desconto = 0.09;
        } else if (qntd > 5) {
            desconto = 0.03;
        }

        valorDesconto = valorUnic * qntd * desconto;
        valorTotal = valorUnic * qntd - valorDesconto;

        System.out.println("Quantidade comprada: " + qntd);
        System.out.println("Valor unitário: R$ " + valorUnic);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        s.close();
	}

}
