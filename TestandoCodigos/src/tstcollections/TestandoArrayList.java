package tstcollections;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoArrayList {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> numeros = new ArrayList<Integer>();
//		ArrayList<Character> letras = new ArrayList<Character>();
//		ArrayList<Boolean> valores = new ArrayList<Boolean>();
//		ArrayList<Double> precos = new ArrayList<Double>();
//		ArrayList<Long> numerosLongos = new ArrayList<Long>();
//		ArrayList<Byte> bytes = new ArrayList<Byte>();
		
		nomes.add("Sérgio");
		nomes.add("Tereza");
		nomes.add("Thiago");
		nomes.add("Anderson");
		nomes.add("Caio");
				
		nomes.remove(0);
		nomes.set(0, "Ana Tereza");
		
		// nomes.clear();
		
		for (int i = 1; i <= 10; i++) {
			numeros.add(i);
//			System.out.println(numeros.get(i - 1));
		}
		
		for (Integer i : numeros) {
			if (i % 2 == 0) {
				System.out.println(i + 2);
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("\nLISTA ORDENADA: ");
		Collections.sort(nomes);
		for (String i : nomes) {
			System.out.println(i);
		}
		
		System.out.println("\n-- Fim do código. --");
	}
}
