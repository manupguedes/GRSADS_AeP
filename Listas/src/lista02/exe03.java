package lista02;
import java.util.Scanner;
public class exe03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String sexo;
		
		System.out.println("Qual o seu sexo? (M: masculino   F: feminino)");
		sexo = s.next();
		
		// usamos equalsIgnoreCase() para verificar se a letra 
		// digitada é "F" ou "M", independentemente de ser maiúscula ou minúscula.
		
		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Seu sexo é MASCULINO");
		}else if (sexo.equalsIgnoreCase("F")){
			System.out.println("Seu sexo é FEMININO");
		}else {
			System.out.println("SEXO INVALIDO");
		}
		s.close();
	}

}
