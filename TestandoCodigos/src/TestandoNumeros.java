import java.util.Random;

public class TestandoNumeros {

    public static void main(String[] args) {
        Random aleatorio = new Random();

        double randomNumber = (Math.round(Math.random() * 101));
        System.out.println(randomNumber);

        float floatNumber = 24.85f;
        System.out.println(Math.round(floatNumber));

        int a = 1, b = 2;
        System.out.println(Math.max(a, b));

        int x = aleatorio.nextInt();
        System.out.println(x);

        int fxNumAleatorio = aleatorio.nextInt(1, 4);
        System.out.println(fxNumAleatorio);
    }
    
}
