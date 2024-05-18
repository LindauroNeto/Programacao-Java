package senha;

import java.util.ArrayList;
import java.util.Random;

public class PasswordCreator {
	private static ArrayList<String> organizador = new ArrayList<String>();
	private static Random aleatorio = new Random();
	private static char ranNumber;
	// v Insipirado pela Amannitta!!! Não foi feito originalmente por mim!!!!!
	// Confira o repositório dela: https://github.com/Amannitta/Gerador-de-Senhas
	private static String opcoesGeral = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$_%&?*§=+¢/\\",
			opcoesLetra = "abcçdefghijklmnopqrstuvwxyzABCÇDEFGHIJKLMNOPQRSTUVWXYZ",
			opcoesMais = "0123456789!@#$_%&?*§=+¢/\\";

	public static void geradorSenha(int qnt) {
		if (qnt > 5) {
			for (int i = 0; i < qnt; i++) {
				ranNumber = opcoesLetra.charAt(aleatorio.nextInt(opcoesLetra.length()));
				organizador.add(Character.toString(ranNumber));
			}

			for (int i = 0; i <= qnt / 3; i++) {
				ranNumber = opcoesMais.charAt(aleatorio.nextInt(opcoesMais.length()));
				organizador.set(aleatorio.nextInt(organizador.size() - 1), Character.toString(ranNumber));
			}
		} else {
			for (int i = 0; i < qnt; i++) {
				ranNumber = opcoesGeral.charAt(aleatorio.nextInt(opcoesGeral.length()));
				organizador.add(Character.toString(ranNumber));
			}
		}

		for (int i = 0; i < organizador.size(); i++) {
			System.out.print(organizador.get(i));
		}
	}
}
