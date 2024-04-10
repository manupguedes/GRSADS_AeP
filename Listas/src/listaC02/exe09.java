package listaC02;
import java.util.Scanner;
public class exe09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String nome, senha, usuCadastrado, senhaCadastrada;

        System.out.println("Cadastre seu nome: ");
        usuCadastrado = s.next();
        System.out.println("Cadastre sua senha: ");
        senhaCadastrada = s.next();
        System.out.println("Digite seu nome de usuário: ");
        nome = s.next();
        System.out.println("Digite sua senha: ");
        senha = s.next();

        if (nome.equals(usuCadastrado) && senha.equals(senhaCadastrada)) {
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Acesso Negado");
        }

        s.close();
	}

}
