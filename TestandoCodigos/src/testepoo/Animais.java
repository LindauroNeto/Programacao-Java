package testepoo;

// POO - Abstração
abstract class Animais {
	protected String nome;
	protected String especie;
	protected abstract void apresentacao();
	protected abstract void somDeAnimal();
	protected abstract void comendo(String comida);
	protected abstract void dormindo();
}