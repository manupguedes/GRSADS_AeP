package lista02;
import java.util.Scanner;
public class exe23 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double num;

        System.out.println("Digite um número: ");
        num = s.nextDouble();

        if (ehInteiro(num)) {
            System.out.println("número inteiro.");
        } else {
            System.out.println("número decimal.");
        }
        s.close();
    }

    public static boolean ehInteiro(double num) {
        return num == Math.round(num);
        
	}


}
