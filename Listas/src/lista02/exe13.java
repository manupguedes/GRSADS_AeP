package lista02;
import java.util.Scanner;
public class exe13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1;
		String diaSemana;
		
		System.out.println("Escreva um número: (1 - 2 - 3 - 4 - 5 - 6 - 7) ");
		n1 = s.nextInt();
		
		//Utilizamos um switch para determinar o dia da semana correspondente ao número digitado pelo usuário.
		
		switch (n1) {
        case 1:
            diaSemana = "Domingo";
            break;
        case 2:
            diaSemana = "Segunda-feira";
            break;
        case 3:
            diaSemana = "Terça-feira";
            break;
        case 4:
            diaSemana = "Quarta-feira";
            break;
        case 5:
            diaSemana = "Quinta-feira";
            break;
        case 6:
            diaSemana = "Sexta-feira";
            break;
        case 7:
            diaSemana = "Sábado";
            break;
        default:
            diaSemana = "Valor inválido";
            break;
    }
		System.out.println("O dia do número digitado é: " + diaSemana);

	}

}
