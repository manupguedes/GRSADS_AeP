package listaC01;
import java.util.Scanner;
public class exe08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int tempF, tempC;
		
		System.out.println("Qual a temperatura? Em Fahrenheit");
		tempF = s.nextInt();
		
		tempC = (tempF - 32) * 5 / 9;
		
		System.out.println("Temperatura em Celsius: " + tempC);
		
		s.close();
	}

}
