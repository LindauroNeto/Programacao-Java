import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestandoDatas {
	public static void main(String[] args) {
		LocalDate dataLocal = LocalDate.now();
		LocalTime horarioLocal = LocalTime.now();
		LocalDateTime tempoLocal = LocalDateTime.now();

		DateTimeFormatter formatadorDeDatas = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
		String dataFormatada = tempoLocal.format(formatadorDeDatas);

		DateTimeFormatter formatadorDataBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy"),
				formatadorDataInvertido = DateTimeFormatter.ofPattern("yyyy-MM-dd"),
				formatadorDataMes = DateTimeFormatter.ofPattern("dd-MMM-yyyy"),
				formatadorDataEspecificado = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

		DateTimeFormatter formatadorDataPersonalizado = DateTimeFormatter.ofPattern("|<| dd/MM/yyyy HH:mm |>|");

		System.out.println(dataLocal);
		System.out.println(horarioLocal);
		System.out.println(tempoLocal);
		System.out.println(dataFormatada);
		System.out.println();

		System.out.println(tempoLocal.format(formatadorDataBarra));
		System.out.println(tempoLocal.format(formatadorDataInvertido));
		System.out.println(tempoLocal.format(formatadorDataMes));
		System.out.println(tempoLocal.format(formatadorDataEspecificado));
		System.out.println();
		System.out.println(tempoLocal.format(formatadorDataPersonalizado));
	}
}
