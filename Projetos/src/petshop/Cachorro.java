package petshop;

public class Cachorro extends Pets {
	Cachorro() {
		tipoAnimal = "Cachorro";
	}

	@Override
	void somPet() {
		System.out.println("Au! Au! Au!");
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de osso!";
	}
}
