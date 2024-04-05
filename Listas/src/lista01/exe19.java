package lista01;
import java.util.Scanner;
public class exe19 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
        
        double anelChip = 4.0, anelAlimento = 3.5, total, qtdeAnelChip,qtdeAnelAlimento;
        int qtdefrango;
        
        System.out.println("Digite quantos frangos tem na granja: ");
        qtdefrango = s.nextInt();
        
        qtdeAnelChip = (qtdefrango * anelChip);
        qtdeAnelAlimento = (qtdefrango * (anelAlimento * 2));
        
        total = (qtdeAnelAlimento + qtdeAnelChip);
        
        System.out.println("O gasto para marcar os frangos da grnaja é: " + total);
        
        s.close();
	}

}
