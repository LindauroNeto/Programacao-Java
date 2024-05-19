public class TestandoCondicoes{

    public static void main(String[] args) {
        int tempo = 12;
        if (tempo == 24 || (tempo >= 0 && tempo < 6)) {
            System.out.println("São " + tempo + "hr(s) da manhã, tenha uma Boa Madrugada.");
        } else if (tempo >= 6 && tempo < 12) {
            System.out.println("São " + tempo + "hrs da manhã, tenha um Bom Dia.");
        } else if (tempo >= 12 && tempo < 18) {
            System.out.println("São " + tempo + "hrs da tarde, tenha uma Boa Tarde.");
        } else if (tempo >= 18 && tempo < 24) {
            System.out.println("São " + tempo + "hrs da noite, tenha uma Boa Noite.");
        } else {
            System.out.println("Esse horário não existe.");
        }

        String resultado = (tempo < 12) ? "Ainda não passou de meio dia." : "Já se passou de meio dia.";
        System.out.println(resultado);

        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("É Segunda-feira.");
                break;
        
            case 2:
                System.out.println("É Terça-feira.");
                break;
        
            case 3:
                System.out.println("É Quarta-feira.");
                break;
        
            case 4:
                System.out.println("É Quinta-feira.");
                break;
        
            case 5:
                System.out.println("É Sexta-feira.");
                break;
        
            case 6:
                System.out.println("É Sábado.");
                break;
        
            case 7:
                System.out.println("É Domingo.");
                break;
        
            default:
                System.out.println("Este valor é inválido.");
                break;
        }
    }
}