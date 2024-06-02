package tstcollections;
import java.util.ArrayList;
import java.util.Iterator;

public class TestandoIterators {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Matheus");
		nomes.add("Amanda");
		
		// Coleta o Iterador da lista
		Iterator<String> it = nomes.iterator();

		// Imprime o próximo item da lista (no caso, aqui vai imprimir o primeiro item dela, "João")
		//System.out.println(it.next());
		
		// Printando todos os itens
		// "Se tiver um 'Próximo item', então:"
		while (it.hasNext()) {
			String i = it.next();
			System.out.println("* " + i);
		}
		
		// Outro caso de printar todos os itens: (Não vale a pena)
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		// Bateu o limite do iterador, além disso, o programa vai dar erro.
		
		System.out.println();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		
		// Coletando o iterador da lista 'numeros'
		Iterator<Integer> itn = numeros.iterator();
		
		// "Se 'próximo item' for 'true' (no caso, se ainda existir um elemento depois), então:"
		while (itn.hasNext()) {
			Integer i = itn.next();
			System.out.println("i: " + i);
			if (i % 2 != 0) {
				itn.remove();
			}
		}
		System.out.println(numeros);
	}

}
