package petshop;

public class Passaro extends Pets {
	Passaro() {
		tipoAnimal = "Pássaro";
	}

	@Override
	void somPet() {
		System.out.println("Piu! Piu! Piu!");
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de voar!";
	}

}
