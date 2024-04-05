package lista01;
import java.util.Scanner;
public class exe02 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);

		int ncvl, nfrd;

		System.out.println("Quantos cavalos foram comprados?");
		ncvl = s.nextInt();

		nfrd = ncvl * 4;

		System.out.println("Seram necessárias " + nfrd + " ferraduras para essa quantidade de cavalos");

		s.close();

	}
	
}