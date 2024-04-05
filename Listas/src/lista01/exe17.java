package lista01;
import java.util.Scanner;
public class exe17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        double c, f;
        
        System.out.println("Digite a temperatura em Celsius: ");
        c = s.nextDouble();
        
        f = ((c * 1.8) + 32);
        
        System.out.println("A temperatura em Fahrenheit é: " + f);
        
        s.close();

	}

}
