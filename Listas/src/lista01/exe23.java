package lista01;
import java.util.Scanner;
public class exe23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		 double AltSombPes, AltPes, AltSombPre, AltPre;
		 
	     System.out.println("Digite a altura da sua sombra: ");
		 AltSombPes = s.nextDouble();
	     System.out.println("Digite a altura da sua pessoa: ");
	     AltPes = s.nextDouble();
	     System.out.println("Digite a altura da sombra do prédio: ");
	     AltSombPre = s.nextDouble();

	     AltPre = (AltSombPre * AltPes) / AltSombPes;

	     System.out.println("A altura do prédio é: " + AltPre + " metros");
	     
	     s.close(); 
	    }

	}