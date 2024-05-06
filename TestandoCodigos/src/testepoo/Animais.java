package testepoo;

// POO - Abstração
abstract class Animais {
    String nome;
    String especie;
    public abstract void apresentacao();
    public abstract void somDeAnimal();
    public abstract void comendo(String comida);
    public abstract void dormindo();
    
}