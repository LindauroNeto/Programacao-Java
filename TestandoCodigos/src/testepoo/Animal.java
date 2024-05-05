package testepoo; // Tá em vermelho por culpa de um bug

// POO - POLIMORFISMO
public abstract class Animal {
	public void somDeAnimal() {
		System.out.println("Som de animal");
	}
	
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		Gato gato1 = new Gato();

		cachorro1.somDeAnimal();
		gato1.somDeAnimal();
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
