public class TestandoLoops {

    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            System.out.println("i: " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("j: " + j);
            j++;
        } while (j < 11);

        for (int k = 0; k <= 10; k += 2) {
            System.out.println("Número par: " + k);
        }

        for (int m = 0; m <= 10; m++) {
            String l = "Número de voltas: " + m;
            System.out.println(l);

            for (int n = 1; n < 10; n += 2) {
                System.out.println(l + "\n\tMetros percorridos: " + n + "m");
            }
            System.out.println("\n\n");
        }

        String[] carros = {"Volvo", "BMW", "Ford", "Mazda", "Fiat", "Wolkswagen", "Chevrolet"};
        for (String o : carros) {
            System.out.println(o);
        }

        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println("Números ímpares: " + a);
            
        }

        for (int b = 10; b >= 0; b--) {
            if (b == 5) {
                break;
            }
            System.out.println(b);
            
        }

        for (int c = 0; c <= 10; c++) {
            if (c % 2 != 0) {
                continue;
            }
            System.out.println("Números pares: " + c);
        }
    }
}