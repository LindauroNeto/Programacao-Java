import java.util.Arrays;
import java.util.List;

public class TestandoLambda {

	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Fernando", "FERNANDO", "ferNando", "fernando", "fErNAndo", "Paulo", "Gustavo", "Luiz", "Pedro", "Vinicius");
		
		nomes.stream()
					.map(n -> n.toUpperCase())
					.distinct()
					.sorted()
					.filter(n -> n.endsWith("O"))
					.map(n -> n.concat(" eh o ESCOLHIDO!"))
					.forEach(System.out::println);
		
		List<String> numeros = Arrays.asList("5", "3", "1", "10", "7", "6", "2", "4", "0", "8", "-1", "9");
		numeros.stream().map(n -> Integer.parseInt(n)).sorted().filter(n -> n > 5).forEach(System.out::println);

	}

}
