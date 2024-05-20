package petshop;

public class Cachorro extends Pets {
	Cachorro() {
		tipoAnimal = "Cachorro";
	}

	@Override
	String somPet() {
		return "Au! Au! Au!";
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de osso!";
	}
	
}