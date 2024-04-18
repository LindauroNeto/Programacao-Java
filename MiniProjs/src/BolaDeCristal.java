import java.util.Random;
import java.util.Scanner;

public class BolaDeCristal {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        
        System.out.println();
        System.out.println("Eu sou o ser da consciência onipotente, Jarius!!");
        System.out.println("Me faça perguntas de sim ou não, como:");
        System.out.println("\"Serei Rico?\"");
        System.out.println("\"Irei me casar com a pessoa dos meus sonhos?\"");
        System.out.println("Me pregunte(completando a frase) e lhe darei a resposta....");
        System.out.print("\nEu serei ");
        String answer = reader.nextLine();
        boolean aleatorio = random.nextBoolean();
        if (aleatorio == true) {
            System.out.println("SIM! Saiba que isso será fácil para você e ainda amará isso!");
        } else {
            System.out.println("Não... naõ será dessa vez que isso irá acontecer.");
        }
    }
}