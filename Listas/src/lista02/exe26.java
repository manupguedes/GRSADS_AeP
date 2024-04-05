package lista02;
import java.util.Scanner;
public class exe26 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

	        double qtdLitrosVendidos, precoLitroGasolina = 2.50, precoLitroAlcool = 1.90, precoFinal = 0;
	        double qtdDesconto, valorAplicado;
	        String tipoCombustivel;

	        System.out.println("Informe a quantidade de litros vendida");
	        qtdLitrosVendidos = s.nextDouble();

	        System.out.println("Informe o tipo de Combústivel (S- Sim N- Não)");
	        tipoCombustivel = s.next().toUpperCase();

	        if(tipoCombustivel.equals("A")){
	            if(qtdLitrosVendidos <= 20){
	                qtdDesconto = 0.03;
	                valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
	                System.out.println(qtdDesconto + " " + valorAplicado);
	                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
	            } else {
	                qtdDesconto = 0.05;
	                valorAplicado = qtdLitrosVendidos * precoLitroAlcool;
	                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
	            }
	        } else if(tipoCombustivel.equals("G")){
	            if(qtdLitrosVendidos <= 20){
	                qtdDesconto = 0.04;
	                valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
	                precoFinal = qtdLitrosVendidos - (valorAplicado * qtdDesconto);
	            } else {
	                qtdDesconto = 0.06;
	                valorAplicado = qtdLitrosVendidos * precoLitroGasolina;
	                precoFinal = valorAplicado - (valorAplicado * qtdDesconto);
	            }
	        }

	        System.out.println("Preço total: R$" + precoFinal);
	        
	        s.close();
	}

}
