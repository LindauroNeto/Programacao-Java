package testepoo;

// POO - POLIMORFISMO
public class Animal {
	public void somDeAnimal() {
		System.out.println("Som de animal");
	}

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Gato gato1 = new Gato();

		cachorro1.somDeAnimal();
		gato1.somDeAnimal();

		Porco porico = new Porco();

		porico.nome = "Xuan bey";
		porico.especie = "Tamworth";
		porico.somDeAnimal();
		porico.apresentacao();
		porico.comendo("cenoura");
		porico.dormindo();
	}
}

class Cachorro extends Animal {
	@Override
	public void somDeAnimal() {
		System.out.println("Au! Au! Au!");
	}
}

class Gato extends Animal {
	@Override
	public void somDeAnimal() {
		System.out.println("Meowww!");
	}
}

// Classe herdando de uma classe abstrata
class Porco extends Animais {
	final String tipoAnimal = "Porco";

	@Override
	public void apresentacao() {
		System.out.format("O %s é um %s da espécie %s.\n", this.nome, tipoAnimal, this.especie);
	}

	@Override
	public void somDeAnimal() {
		System.out.println("Oinc! Oinc! Oinc!");
	}

	@Override
	public void comendo(String comida) {
		System.out.format("%s está comendo %s.\n", this.nome, comida);
	}

	@Override
	public void dormindo() {
		System.out.format("%s estah dormindo.... Zzz Zzz Zzz\n", this.nome);
	}
}
