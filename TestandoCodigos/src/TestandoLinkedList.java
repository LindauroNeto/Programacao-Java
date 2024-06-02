import java.util.LinkedList;

public class TestandoLinkedList {

	public static void main(String[] args) {
		LinkedList<Character> letrasAlfabeto = new LinkedList<Character>();
		
		letrasAlfabeto.add('V');
		letrasAlfabeto.add('K');
		letrasAlfabeto.add('L');
		
		@SuppressWarnings("unchecked")
		LinkedList<Character> letrasCopia = (LinkedList<Character>) letrasAlfabeto.clone();
		
		System.out.println("Primeira letra: " + letrasAlfabeto.getFirst());
		System.out.println("Última letra: " + letrasAlfabeto.getLast());
		
		letrasAlfabeto.removeFirst();
		letrasAlfabeto.removeLast();

		letrasAlfabeto.addFirst('A');
		letrasAlfabeto.addLast('Z');
		
		letrasCopia.addFirst('A');
		letrasCopia.addLast('Z');
		
		for (Character i : letrasAlfabeto) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (Character i : letrasCopia) {
			System.out.println(i);
		}

	}

}