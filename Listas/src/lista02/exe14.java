package lista02;
import java.util.Scanner;
public class exe14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double nota1, nota2, media;
		String conceito, mensagem;

		 System.out.println("Digite a primeira nota: ");
	        nota1 = s.nextDouble();
	        System.out.println("Digite a segunda nota: ");
	        nota2 = s.nextDouble();

	        media = (nota1 + nota2) / 2;

	        if (media >= 9.0 && media <= 10.0) {
	            conceito = "A";
	            mensagem = "APROVADO";
	        } else if (media >= 7.5 && media < 9.0) {
	            conceito = "B";
	            mensagem = "APROVADO";
	        } else if (media >= 6.0 && media < 7.5) {
	            conceito = "C";
	            mensagem = "APROVADO";
	        } else if (media >= 4.0 && media < 6.0) {
	            conceito = "D";
	            mensagem = "REPROVADO";
	        } else if (media >= 0 && media < 4.0) {
	            conceito = "E";
	            mensagem = "REPROVADO";
	        } else {
	            conceito = "Indefinido";
	            mensagem = "Indefinido";
	        }

	        System.out.println("Nota 1: " + nota1);
	        System.out.println("Nota 2: " + nota2);
	        System.out.println("Média: " + media);
	        System.out.println("Conceito: " + conceito);
	        System.out.println("Situação: " + mensagem);
	        
	        s.close();
	}

}
