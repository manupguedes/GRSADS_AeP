package lista01;
import java.util.Scanner;
public class exe25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		float h, raio;
		double total;
		
        System.out.println("Digite a altura da caixa de agua (em metros)");
        h = s.nextFloat();
        System.out.println("Digite o raio da caixa de agua (em metros)");
        raio = s.nextFloat();
        
        total = (3.14 * h * (raio * raio));    
        
        System.out.println(total + " metros cubicos");
        
        s.close();
	}

}
