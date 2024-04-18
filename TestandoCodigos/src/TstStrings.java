public class TstStrings {

    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.indexOf("T"));
        System.out.println(txt.indexOf('A'));
        System.out.println(txt.indexOf('X'));

        String PrimNome = "Paulo";
        String UltiNome = "Sergio";
        System.out.println(PrimNome.concat(" " + UltiNome));

        String niceText = "It\'s alright when you use the \"\\\", known as the \"backlash\".";
        System.out.println(niceText);

        String bars = "Olá\rMundo!\r";
        System.out.println(bars);
    }
}