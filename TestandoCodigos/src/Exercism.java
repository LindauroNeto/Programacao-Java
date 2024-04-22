import java.io.*;
import java.util.*;

@SuppressWarnings("unused")
public class Exercism {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        scanner.nextLine();
        String myString = scanner.nextLine();
        scanner.close();
        
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myString);
    }
}