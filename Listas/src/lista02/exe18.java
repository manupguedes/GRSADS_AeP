package lista02;
import java.util.Scanner;
public class exe18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dia, mes, ano;
		String data;

		System.out.println("Digite uma data no formato dd/mm/aaaa: ");
        data = s.nextLine();
        
        //uma expressão regular (\\d{2}/\\d{2}/\\d{4}) para verificar se a string está no formato correto de uma data (dd/mm/aaaa).
        //usamos o método split() para dividir a string nos componentes dia, mês e ano.
        //é usado para converter uma string em um valor do tipo int. Ele faz parte da classe Integer 

        if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            String[] partes = data.split("/");
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
            
            //boolean é um tipo de dado que pode ter apenas dois valores: true ou false

            boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            boolean mesValido = mes >= 1 && mes <= 12;
            boolean diaValido;
            
            switch (mes) {
                case 2: 
                    if (bissexto) {
                        diaValido = dia >= 1 && dia <= 29;
                    }else{
                        diaValido = dia >= 1 && dia <= 28;
                    }break;
                case 4: case 6: case 9: case 11: 
                    diaValido = dia >= 1 && dia <= 30;
                    break;
                default: 
                    diaValido = dia >= 1 && dia <= 31;
                    break;
            }

            if (ano >= 0 && mesValido && diaValido) {
                System.out.println("A data " + data + " é válida.");
            }else{
                System.out.println("A data " + data + " não é válida.");
            }
        }else{
            System.out.println("Formato de data inválido.");
        }
	}

}
