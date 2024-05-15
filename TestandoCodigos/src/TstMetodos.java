public class TstMetodos {

    static void meuMetodo() {
        System.out.println("EU como maçã todo dia.");
    }

    static void nomeCompleto(String x, String y) {
        System.out.println(x + " " + y);
    }

    static int matSoma(int x, int y) {
        int z = x + y;
        return z;
    }

    static void checkIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Você já tem idade para votar! O que voçê está esperando?");
        } else if (idade < 18 && idade >= 16) {
            System.out.println("Olha, você não tem a idade recomendada para votar... Mas se quiser você já pode votar sim!");
        } else {
            System.out.println("Você não possue a idade mínima para votar.");
        }
    }

    static int fatorial(int k) {
        if (k > 1) {
            return k * fatorial(k - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        meuMetodo();

        String PrimNome = "Pedro", UltiNome = "Gonçalves";
        nomeCompleto(PrimNome, UltiNome);

        System.out.println(matSoma(4, 6));

        checkIdade(66);

        {
            int a = 2, b = 3;
            System.out.println(matSoma(a, b));
        }
        {
            int a = 1, b = 7;
            System.out.println(matSoma(a, b));
        }

        int resultado = fatorial(5);
        System.out.println(resultado);
    }
}