package lista01;
import java.util.Scanner;
public class exe26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
		int n1, n2, n3, multi;
		
        System.out.println("Digite 3 números");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        
        multi = n1 * n2 * n3;
        
        System.out.println("A multiplicação dos números é " + multi);
        
        s.close();

	}

}
