package testepoo;

// POO - Abstração
abstract class Animais {
	String nome;
	String especie;
	abstract void apresentacao();
	abstract void somDeAnimal();
	abstract void comendo(String comida);
	abstract void dormindo();
}