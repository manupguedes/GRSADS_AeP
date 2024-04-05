package lista02;
import java.util.Scanner;
public class exe27 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        double precoMorango = 2.5, precoMaca = 1.8, qtdMorango, qtdMaca;
        double pesoTotal, precoFinal;

        System.out.println("Informe a Quantidade em Kilos de Morango");
        qtdMorango = s.nextDouble();

        System.out.println("Informe a Quantidade em Kilos de Maca");
        qtdMaca = s.nextDouble();

        pesoTotal = qtdMorango + qtdMaca;
        precoFinal = (qtdMorango * precoMorango) + (qtdMaca * precoMaca);

        if(pesoTotal >= 8 || precoFinal >= 25){
            precoFinal = precoFinal - (precoFinal * 0.1);
        }

        System.out.println("Preço Final: R$" + precoFinal);
        
        s.close();
	}

}
