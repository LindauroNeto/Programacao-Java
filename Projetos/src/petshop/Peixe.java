package petshop;

public class Peixe extends Pets {
	Peixe() {
		tipoAnimal = "Peixe";
	}

	@Override
	void somPet() {
		System.out.println("Blu... Blu... Blu!");
	}

	@Override
	String preferencia() {
		return this.nome + " gosta muito de... agua?";
	}

}
