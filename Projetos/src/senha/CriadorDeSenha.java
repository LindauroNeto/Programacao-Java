package senha;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CriadorDeSenha {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Quantos digitos você vai querer a sua senha?");
		try {
			int leitor = scanner.nextInt();
			PasswordCreator.geradorSenha(leitor);
		} catch (InputMismatchException ime) {
			System.out.println("Valor inválido.");
		} finally {
			scanner.close();
		}
	}

}
