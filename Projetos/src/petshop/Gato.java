package petshop;

public class Gato extends Pets {
	Gato() {
		tipoAnimal = "Gato";
	}

	@Override
	void somPet() {
		System.out.println("Meow! Meow!");
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de peixe!";
	}
}
