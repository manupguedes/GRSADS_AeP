package lista01;
import java.util.Scanner;
public class exe11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int anos, dias, mes, dia ;

		System.out.println("Quantos dias sem acidente de trabalho? ");
		dias = s.nextInt();

		anos = dias / 360;
		mes = (dias / 30) - anos * 12;
		dia = dias - (mes * 30) - (anos * 360);

		System.out.println("Quantidade de anos: " + anos);
		System.out.println("Quantidade de mes:  " +mes);
		System.out.println("Quantidade de dias: " +dia);

		s.close();

	}

}