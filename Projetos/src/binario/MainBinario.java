package binario;
import java.util.Scanner;

public class MainBinario {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual tipo de conversão você desejar fazer?");
        System.out.println("1 - Converter de DECIMAL para BINÁRIO");
        System.out.println("2 - Converter de BINÁRIO para DECIMAL");
        String opc = scanner.nextLine();
        
        switch (opc) {
		case "1":
			System.out.println("Digite o valor em Decimal para converter para Binário:");
	        int scannerDecimal = scanner.nextInt();
	        
	        if (scannerDecimal == 0 || scannerDecimal == 1) {
	        	Conversor.linhas();
				System.out.println(scannerDecimal);
			} else {
				Conversor.DecimalToBinary(scannerDecimal);
			}
	        
			break;
			
		case "2":
	        System.out.println("Digite o valor em Binário para converter para Decimal:");
	        String scannerBinario = scanner.nextLine();
	        Conversor.BinaryToDecimal(scannerBinario);
			break;

		default:
			System.out.format("A opção \'%s\' é inválida", opc);	
			break;
		}
        scanner.close();
    }
}