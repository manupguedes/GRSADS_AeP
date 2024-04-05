package lista02;
import java.util.Scanner;
public class exe05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float nota1, nota2, media;
		
		System.out.println("Qual a nota 01 do aluno?");
		nota1 = s.nextFloat();
		System.out.println("Qual a nota 02 do aluno?");
		nota2 = s.nextFloat();

		media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media);
		
		if (media > 6.9 && media < 10.0) {
			System.out.println("APROVADO!");
		}else if (media == 10.0) {
			System.out.println("APROVADO COM DISTINÇÃO!");
		}else {
			System.out.println("REPROVADO!");
		}
		s.close();
	}

}
