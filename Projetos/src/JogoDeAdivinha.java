import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinha {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        
        int ranNumber = random.nextInt(100)+1;
        int answer = 999;
        
        System.out.println("\nSeja bem vindo ao jogo de adivinha! Tente adivinhar um número de 0 a 100, boa sorte!");

        while (answer != ranNumber) {
            System.out.println("------------------------------------------");
            System.out.println("Qual é o seu chute? ");
            answer = reader.nextInt();

            if (answer > ranNumber) {
                System.out.println("Calma aí! Esse valor é muito alto!");
            } else if (answer < ranNumber) {
                System.out.println("Esse valor é muito baixo!");
            } else {
                System.out.println("Parabéns! Você achou o número "+ ranNumber+ "!");
            }
        }
        reader.close();   
    }
}
