package lista02;
import java.util.Scanner;
public class exe04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		char letra;
		
		System.out.println("Digite uma letra: ");
        letra = s.next().toLowerCase().charAt(0);
        
        //toLowerCase() para converter a entrada para minúsculas
        //charAt(0) para obter o primeiro caractere da string digitada.

        if (Character.isLetter(letra)) {
        	
        //Verificamos se o caractere é uma letra usando Character.isLetter()
        	
            if ("aeiou".indexOf(letra) != -1) {
            	
        //verificamos se é uma vogal (a, e, i, o, u) procurando a letra na string "aeiou"
        //.Se estiver presente, indexOf() retornará um valor diferente de -1
            	
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("Por favor, digite apenas uma letra.");
        }

	}

}
