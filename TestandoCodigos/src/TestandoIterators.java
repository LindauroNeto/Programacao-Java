import java.util.ArrayList;
import java.util.Iterator;

public class TestandoIterators {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Matheus");
		nomes.add("Amanda");
		
		Iterator<String> it = nomes.iterator();

//		System.out.println(it.next());
		
		while (it.hasNext()) {
			System.out.println("* " + it.next());
		}
		
		System.out.println();
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			numeros.add(i);
		}
		
		Iterator<Integer> itn = numeros.iterator();
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
