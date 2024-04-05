package lista01;
import java.util.Scanner;
public class exe21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        int qtdeLata, qtdeGar6, qtdeGar2;
        double total;
        
        System.out.println("Quantas latas foram compradas?");
        qtdeLata = s.nextInt();
        System.out.println("Quantas Garrafas de 600 ml foram compradas?");
        qtdeGar6 = s.nextInt();
        System.out.println("Quantas Garrafas de 2 litros foram compradas?");
        qtdeGar2 = s.nextInt();
        
        total = ((qtdeLata * 0.35) + (qtdeGar6 * 0.6) + (qtdeGar2 * 2));
        
        System.out.println("Foram comprados " + total + " litros");
        
        s.close();

	}

}
