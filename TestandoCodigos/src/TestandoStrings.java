public class TestandoStrings {

    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("O tamanho da string txt é: " + txt.length());

        System.out.println(txt.indexOf("T"));
        System.out.println(txt.indexOf('A'));
        System.out.println(txt.indexOf('X'));
        System.out.println(txt.charAt(0));
        System.out.println(txt.charAt(9));

        String PrimNome = "Paulo";
        String UltiNome = "Sergio";
        System.out.println(PrimNome.concat(" " + UltiNome));

        String niceText = "It\'s alright when you use the \"\\\", known as the \"backlash\".";
        System.out.println(niceText);

        String bars = "Olá\rMundo!\r";
        System.out.println(bars);
    }
}