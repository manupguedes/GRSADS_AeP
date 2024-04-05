package lista01;
import java.util.Scanner;
public class exe05 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);

		double vlrpagamento, vlrgasolina, vlrtotal;

		System.out.println("Qual o valor da gasolina? ");
		vlrgasolina = s.nextDouble();
		System.out.println("Qual o valor do pagamento? ");
		vlrpagamento = s.nextDouble();

		vlrtotal = vlrpagamento / vlrgasolina;

		System.out.println("O valor pago gerou " + vlrtotal + " litros de gasolina.");

		s.close();

	}

}