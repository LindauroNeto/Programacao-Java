package binario;
import java.util.ArrayList;
// SUJEITO A ERROS

public class Conversor {
    static ArrayList<String> arranjo = new ArrayList<String>();
    static void linhas() { System.out.println("---------------"); }

	@SuppressWarnings("unused")
	static void DecimalToBinary(int decimal) {
    	arranjo.add(Integer.toString(decimal % 2));
        for (int i = 0; decimal / 2 != 1; i++) {
            decimal /= 2;
            arranjo.add(Integer.toString(decimal % 2));
        }
        arranjo.add(Integer.toString(decimal/2));
        
        linhas();
        
        for (int i = arranjo.size() - 1; i >= 0; i--) {
            System.out.print(arranjo.get(i));
        }
    }

	static void BinaryToDecimal(String binario) {
		int j = 0;
		for (int i = binario.length() - 1; i >= 0; i--) {
			arranjo.add(Character.toString(binario.charAt(i)));			
		}
		
		for (int i = 0; i < arranjo.size(); i++) {
			j += (int) (Integer.parseInt(arranjo.get(i)) * Math.pow(2, i));
		}
		
		linhas();
		System.out.println(j);
	}
}