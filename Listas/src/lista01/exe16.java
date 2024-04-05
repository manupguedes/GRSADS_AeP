package lista01;
import java.util.Scanner;
public class exe16 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    
    int qtdeHamb;
    double queijoHamb, presunto;
    
    System.out.println("Informe quandos hamburguers a fazer: ");
    qtdeHamb = s.nextInt();
    
    queijoHamb = (qtdeHamb * 0.10);
    presunto = (qtdeHamb * 0.05);
    
    System.out.println("Deve comprar em kg: \n"
                     + "Queijo: " + queijoHamb + "\n"
                     + "Presunto: " + presunto + "\n"
                     + "Hamburguer: " + queijoHamb + "\n");
    
    s.close();

	}

}
