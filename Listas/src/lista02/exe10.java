package lista02;
import java.util.Scanner;
public class exe10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String periodo;
		
		System.out.println("Qual que você estuda? (M: matutino   V: vespertino   N: noturno)");
		periodo = s.next();
		
		// usamos equalsIgnoreCase() para verificar se a letra 
		// digitada é "F" ou "M", independentemente de ser maiúscula ou minúscula.
		
		if (periodo.equalsIgnoreCase("M")) {
			System.out.println("BOM DIAA!");
		}else if (periodo.equalsIgnoreCase("V")){
			System.out.println("BOA TARDEE!");
		}else if (periodo.equalsIgnoreCase("N")){
			System.out.println("BOA NOITEE!");
		}else {
			System.out.println("PERIODO INVALIDO");
		}
		s.close();
	}

}
