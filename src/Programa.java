import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		String email;
		System.out.println("Digite um email: ");
		email = new Scanner(System.in).nextLine();

		int posicaoSimbolo = email.indexOf("@");

		String dominio = email.substring(posicaoSimbolo);

		System.out.println("O dominio do e-mail é: " + dominio);

	}
}