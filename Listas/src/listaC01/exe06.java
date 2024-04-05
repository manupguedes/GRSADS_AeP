package listaC01;
import java.util.Scanner;
public class exe06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double custoFabrica, porcentagemDistribuidor, porcentagemImpostos, custoDistribuidor, custoImpostos, custoFinal;

        System.out.println("Digite o custo de fábrica do carro: ");
        custoFabrica = s.nextDouble();

        porcentagemDistribuidor = 0.28;
        porcentagemImpostos = 0.45;

        custoDistribuidor = custoFabrica * porcentagemDistribuidor;
        custoImpostos = custoFabrica * porcentagemImpostos;
        custoFinal = custoFabrica + custoDistribuidor + custoImpostos;

        System.out.println("O custo final do carro ao consumidor é: " + custoFinal);
 
        s.close();
	}

}
