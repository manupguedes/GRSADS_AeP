package lista02;
import java.util.Scanner;
public class exe25 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

        int contaCulpado = 0;
        String respostaSuspeito;

        System.out.println("Telefonou para a vítima? (S- Sim N- Não)");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contaCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Esteve no local do crime? (S- Sim N- Não)");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contaCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Mora perto da vítima? (S- Sim N- Não)");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contaCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Devia para a vítima? (S- Sim N- Não)");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contaCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        System.out.println("Já trabalhou com a vítima? (S- Sim N- Não)");
        respostaSuspeito = s.next().toUpperCase();

        if(respostaSuspeito.equals("S")){
            contaCulpado++;
            respostaSuspeito = " ";
        } else if(respostaSuspeito.equals("N")){
            respostaSuspeito = " ";
        }

        if(contaCulpado == 5){
            System.out.println("Culpado");
        } else if(contaCulpado >= 3){
            System.out.println("Cúmplice");
        } else if(contaCulpado == 2){
            System.out.println("Suspeito");
        } else {
            System.out.println("Inocente");
        }
        s.close();
	}

}
