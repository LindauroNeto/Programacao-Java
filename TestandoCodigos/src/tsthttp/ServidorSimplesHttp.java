package tsthttp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ServidorSimplesHttp {

	public static void main(String[] args) throws IOException {

		final ServerSocket servidor = new ServerSocket(8080);
		System.out.println("Ouvindo a conexão na porta 8080...");
		// Para rodar, coloque 'http://localhost:8080' no browser.

		while (true) {
			try (Socket socket = servidor.accept()){
				LocalDateTime ldt = LocalDateTime.now();
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("|<| EEEE dd/MM/yyyy HH:mm:ss |>|");
				String hoje = "Horario local atual: " + ldt.format(dtf);
				String respostaHttp = "HTTP/1.1 200 OK\r\n\r\n" + hoje;
				socket.getOutputStream().write(respostaHttp.getBytes("UTF-8"));
			}
		}
	}

}
