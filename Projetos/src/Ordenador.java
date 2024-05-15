import java.util.Random;

public class Ordenador {
    static int[] listNumbers = new int[10];
    static Random random = new Random();

    static void ordenador(){
        // *- O código deste método não é meu. Vi pelo canal 'Coding with John'
        for (int i = 1; i < listNumbers.length; i++) {
            int maiorValor = listNumbers[i];

            int j = i - 1;
            while (j >= 0 && listNumbers[j] > maiorValor) {
                listNumbers[j + 1] = listNumbers[j];
                j--;
            }
            listNumbers[j + 1] = maiorValor;
        }
        // -*

        System.out.print("Valor organizado: [ ");
        for (int i = 0; i < listNumbers.length; i++) {
            System.out.print(listNumbers[i]+ " ");
        }
        System.out.print("]");
    }
    
    public static void main(String[] args) {
        System.out.print("Valor bagunçado:  [ ");
        for (int i = 0; i < listNumbers.length; i++) {
            listNumbers[i] = random.nextInt(100+1);
            System.out.print(listNumbers[i]+ " ");
        }
        System.out.println("]");
        
        ordenador();
    }
}
