import java.util.ArrayList;

public class tstArrays {
    static String[] carros = {"BMW", "Wolkswagen", "Camaro", "Ferrari"};
    static int[] umADez = new int[10];
    
    public static void main(String[] args) {
        ArrayList<Integer> umAInfinito = new ArrayList<Integer>();

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i]);
        }

        System.out.println("-----------------------------------------");

        for (int i = 0; i < umADez.length; i++) {
            umADez[i] = i+1;
            System.out.print(umADez[i]+ " ");
        }

        System.out.println("\n-----------------------------------------");
        
        for (int i = 0; i < 1000; i++) {
            umAInfinito.add(i+1);
        }
        for (Integer i : umAInfinito) {
            System.out.print(i+" ");
        }
        
        System.out.println("\n-----------------------------------------");
        for (int i = 0; i < carros.length; i++) {
            System.out.printf("%-15s%5d%n", carros[i], umADez[i]);
        }    
    }
}
