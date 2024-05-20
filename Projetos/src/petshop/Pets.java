package petshop;

import java.util.Random;

public abstract class Pets {
	protected String nome, tipoAnimal, genero;

	private final Random random = new Random();
	private boolean aleatorio = random.nextBoolean();

	abstract String somPet();
	abstract String preferencia();

	void comer() {
		System.out.format("%s está comendo.\n", this.nome);
	}

	void brincar() {
		System.out.format("%s está brincando!\n", this.nome);
	}

	void dormir() {
		System.out.format("%s está dormindo... Zzz Zzz Zzz\n", this.nome);
	}

	Pets() {
		genero = (aleatorio) ? "Macho" : "Femêa";
	}
	
}
