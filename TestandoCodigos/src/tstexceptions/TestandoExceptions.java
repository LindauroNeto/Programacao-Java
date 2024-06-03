package tstexceptions;

public class TestandoExceptions {

	public static void main(String[] args) throws ImprobableAgeException {
		// Exceptions comuns
		int[] intArray = {1, 2, 3, 4, 5, 6};
		
		try {
			System.out.println(intArray[9]);
		} catch (Exception e) {
			System.err.println("Algo deu errado... " + e);
		} finally {
			System.out.println("Fim do código.\n");
		}
		
		// Exceptions personalizadas
		int idade = 1000;

		System.out.println(checkIdade(idade));
	}

	private static int checkIdade(int idade) throws ImprobableAgeException {
		if (idade < 0 | idade >= 150) {
			throw new ImprobableAgeException("Opa! Essa idade não existe.");
		} else {
			return idade;
		}
	}

}
