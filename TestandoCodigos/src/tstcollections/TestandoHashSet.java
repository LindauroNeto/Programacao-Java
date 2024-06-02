package tstcollections;
import java.util.HashSet;

public class TestandoHashSet {

	public static void main(String[] args) {
		HashSet<String> carros = new HashSet<String>();
		
		carros.add("BMW");
		carros.add("BMW");
		carros.add("BMW");
		carros.add("BMW");
		carros.add("BMW");
		carros.add("BMW");
		carros.add("Chevrolet");
		carros.add("Ferrari");
		
		for (String i : carros) {
			System.out.println(i);
		}
		
		System.out.println("Tamanho da lista: " + carros.size());
		
		System.out.println(carros.contains("BMW"));

	}

}
