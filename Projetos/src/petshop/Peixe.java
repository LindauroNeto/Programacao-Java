package petshop;

public class Peixe extends Pets {
	Peixe() {
		tipoAnimal = "Peixe";
	}

	@Override
	String somPet() {
		return "Blu... Blu... Blu!";
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de... agua?";
	}

}