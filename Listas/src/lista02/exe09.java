package lista02;
import java.util.Scanner;
public class exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
	    n1 = s.nextInt();
	    System.out.println("Digite o segundo número: ");
	    n2 = s.nextInt();
	    System.out.println("Digite o terceiro número: ");
	    n3 = s.nextInt();

	    if (n1 >= n2 && n1 >= n3) {
	        if (n2 >= n3) {
	           System.out.println(n1 + ", " + n2 + ", " + n3);
            } else {
                System.out.println(n1 + ", " + n3 + ", " + n2);
            }
        } else if (n2 >= n1 && n2 >= n3) {
            if (n1 >= n3) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else {
                System.out.println(n2 + ", " + n3 + ", " + n1);
            }
        } else {
            if (n1 >= n2) {
                System.out.println(n3 + ", " + n1 + ", " + n2);
            } else {
                System.out.println(n3 + ", " + n2 + ", " + n1);
            }
        }
	    s.close();
	}

}
