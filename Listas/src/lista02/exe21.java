package lista02;
import java.util.Scanner;
public class exe21 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int valorSaque, notas100, notas50, notas10, notas5, notas1;

        System.out.println("Digite o valor do saque (entre 10 e 600 reais): ");
        valorSaque = s.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor de saque inválido. O valor mínimo é 10 e o máximo é 600 reais.");
            return;
        }

        notas100 = valorSaque / 100;
        valorSaque %= 100;
        notas50 = valorSaque / 50;
        valorSaque %= 50;
        notas10 = valorSaque / 10;
        valorSaque %= 10;
        notas5 = valorSaque / 5;
        valorSaque %= 5;
        notas1 = valorSaque;

        System.out.println("Notas fornecidas:");
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 1: " + notas1);
        
        s.close();

	}

}
