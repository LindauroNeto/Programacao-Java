import java.util.ArrayList;

public class TestandoInstanceof {
	
	public static void main(String[] args) {
		ArrayList<Object> listaAleatoria = new ArrayList<Object>();
		int totalString = 0, totalInt = 0, totalFloat = 0, totalDouble = 0, totalChar = 0, totalBool = 0;
		listaAleatoria.add("rnenrgjrek");
		listaAleatoria.add("abcde");
		listaAleatoria.add("fghij");
		listaAleatoria.add("klmno");
		listaAleatoria.add("pqrst");
		listaAleatoria.add("uvwxy");
		listaAleatoria.add("z");
		listaAleatoria.add('z');
		listaAleatoria.add(123);
		listaAleatoria.add(456);
		listaAleatoria.add(789);
		listaAleatoria.add(102);
		listaAleatoria.add(682);
		listaAleatoria.add(491);
		listaAleatoria.add(233.4f);
		listaAleatoria.add(49.90f);
		listaAleatoria.add(69.69f);
		listaAleatoria.add(3.14985929529284d);
		listaAleatoria.add(6.000000020400050000d);
		listaAleatoria.add(24759845566d);
		listaAleatoria.add('A');
		listaAleatoria.add('B');
		listaAleatoria.add('C');
		listaAleatoria.add("MERDA");
		listaAleatoria.add(true);
		listaAleatoria.add(false);
		listaAleatoria.add(true);
		
		for (Object object : listaAleatoria) {
			if (object instanceof String) {
				totalString++;
			} else if (object instanceof Integer) {
				totalInt++;
			} else if (object instanceof Character) {
				totalChar++;
			} else if (object instanceof Float) {
				totalFloat++;
			} else if (object instanceof Boolean){
				totalBool++;
			} else if (object instanceof Double){
				totalDouble++;
			}
		}
		listaAleatoria.forEach(i -> System.out.print(i + ", "));
		System.out.println("\n\nResultados: "
				+ "\nTotal String: " + totalString
				+ "\nTotal Integer: " + totalInt
				+ "\nTotal Float: " + totalFloat
				+ "\nTotal Double: " + totalDouble
				+ "\nTotal Character: " + totalChar
				+ "\nTotal Boolean: " + totalBool);
		
	}
}
