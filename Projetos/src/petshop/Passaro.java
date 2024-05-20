package petshop;

public class Passaro extends Pets {
	Passaro() {
		tipoAnimal = "Pássaro";
	}

	@Override
	String somPet() {
		return "Piu! Piu! Piu!";
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de voar!";
	}
	
}