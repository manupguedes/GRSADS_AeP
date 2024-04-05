package lista01;
import java.util.Scanner;
public class exe24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        float litros;
        double total, maracuja, agua;
        
        System.out.println("Quantos litros de refresco você deseja fazer?");
        litros = s.nextFloat();
        
        total = (litros / 5);
        
        maracuja = total;
        agua = (total * 4);
        
        System.out.println("Você precisa de " + agua + " litros de água e " + maracuja + " litros de suco para fazer o refreco");

        s.close();
	}

}
