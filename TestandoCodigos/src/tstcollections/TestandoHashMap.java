package tstcollections;
import java.util.HashMap;

public class TestandoHashMap {

	public static void main(String[] args) {
		HashMap<String, String> capitaisBrasileiras = new HashMap<String, String>();
		
		capitaisBrasileiras.put("BA", "Salvador");
		capitaisBrasileiras.put("CE", "Fortaleza");
		capitaisBrasileiras.put("MA", "São Luiz");
		capitaisBrasileiras.put("RJ", "Rio de Janeiro");
		capitaisBrasileiras.put("SP", "São Paulo");
		capitaisBrasileiras.put("MG", "Belo Horizonte");
		
//		System.out.println(capitaisBrasileiras.get("MG"));
//		capitaisBrasileiras.remove("RJ");
//		System.out.println(capitaisBrasileiras);
		
		// Keys/Chaves:
		System.out.println("Estados: ");
		for (String i : capitaisBrasileiras.keySet()) {
			System.out.println("- " + i);
		}
		
		System.out.println();
		
		// Values/Valores:
		System.out.println("Capitais: ");
		for (String i : capitaisBrasileiras.values()) {
			System.out.println("-- " + i);
		}
		
		System.out.println();
		
		// Keys e Values:
		System.out.println("Estados e suas devidas capitais: ");
		for (String i : capitaisBrasileiras.keySet()) {
			System.out.println("- " + i + "\t" + capitaisBrasileiras.get(i));
		}

	}

}
