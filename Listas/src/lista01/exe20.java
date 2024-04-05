package lista01;
import java.util.Scanner;
public class exe20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int blusas;
		float novelos, total;
		
        System.out.println("Quantas blusas foram produziu?");
        blusas = s.nextInt();
        
        System.out.println("Quantos novelos foram utilizados?");
        novelos = s.nextFloat();
        
        total = (novelos / blusas);
        
        System.out.println("Você usa " + total + " novelos para cada blusa");
        
        s.close();

	}

}
