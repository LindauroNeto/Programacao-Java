package petshop;

public class Gato extends Pets {
	Gato() {
		tipoAnimal = "Gato";
	}

	@Override
	String somPet() {
		return "Meow! Meow!";
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de peixe!";
	}
	
}