package lista02;
import java.util.Scanner;
public class exe29 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        double valorEmprestimo, rendaMensal;
        int qtdPontos;

        System.out.println("Informe o valor do emprestimo");
        valorEmprestimo = s.nextDouble();

        if(valorEmprestimo <= 10000){
            System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
        } else if(valorEmprestimo <= 50000){
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = s.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }
        } else if(valorEmprestimo > 50000) {
            System.out.println("Informe a sua Pontuação de Crédito");
            qtdPontos = s.nextInt();
            if(qtdPontos >= 10000){
                System.out.println("Informe a sua Renda Mensal");
                rendaMensal = s.nextDouble();
                if(rendaMensal > 5000){
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Aprovado com Sucesso");
                }  else {
                    System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado por Renda Mensal Insuficiente");
                }
            } else {
                System.out.println("Empréstimo no valor de R$" + valorEmprestimo + " Negado pela falta de Pontuação");
            }

        }
        s.close();
	}

}
