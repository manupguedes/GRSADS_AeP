package listaC01;
import java.util.Scanner;
public class exe07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        System.out.println("Digite o número de carros vendidos: ");
        int carrosVendidos = s.nextInt();

        System.out.println("Digite o valor total de vendas: ");
        double valorVendas = s.nextDouble();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = s.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido: ");
        double valorPorCarro = s.nextDouble();

        double comissaoFixa = carrosVendidos * valorPorCarro;
        double comissaoPorVendas = valorVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPorVendas;

        System.out.println("O salário final do vendedor é: " + salarioFinal);
        
        s.close();
	}

}
