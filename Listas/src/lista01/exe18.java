package lista01;
import java.util.Scanner;
public class exe18 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            
        int hNormais, hExtras;
        double salBruto, impos, salLiqui;
        
         System.out.print("Digite o número de horas normais trabalhadas: ");
         hNormais = s.nextInt();
         System.out.print("Digite o número de horas extras trabalhadas: ");
         hExtras = s.nextInt();

        salBruto = ((hNormais * 10) + (hExtras * 15));
        impos = (salBruto * 0.10);
        salLiqui = salBruto - impos;
         
         System.out.println("Salário bruto: R$" + salBruto);
         System.out.println("Salário líquido: R$" + salLiqui);
         
         s.close();

	}

}
