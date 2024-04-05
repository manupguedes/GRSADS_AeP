package lista02;
import java.util.Scanner;
public class exe24 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n1, n2,resultado;
		int escolha;

        System.out.println("Digite o primeiro número: ");
        n1 = s.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = s.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        escolha = s.nextInt();

        String operacao = "";

        switch (escolha) {
            case 1:
                resultado = n1 + n2;
                operacao = "Soma";
                break;
            case 2:
                resultado = n1 - n2;
                operacao = "Subtração";
                break;
            case 3:
                resultado = n1 * n2;
                operacao = "Multiplicação";
                break;
            case 4:
                if (n2 != 0) {
                    resultado = n1 / n2;
                    operacao = "Divisão";
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("O resultado da " + operacao + " é: " + resultado);
        verificarParImpar(resultado);
        verificarPositivoNegativo(resultado);
        
        s.close();
    }

    public static void verificarParImpar(double num) {
        if (num % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
            
        }
    }

    public static void verificarPositivoNegativo(double num) {
        if (num > 0) {
            System.out.println("O número é positivo.");
        } else if (num < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        
	}

}
