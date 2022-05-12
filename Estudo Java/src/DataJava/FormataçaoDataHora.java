package DataJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormataçaoDataHora {

	public static void main(String[] args) {
		
		//sem esta formatada
		LocalDateTime datahora = LocalDateTime.now();
		System.out.println("Antes da Formatação: "+ datahora);
		
		//formatando a data 
		DateTimeFormatter formatada = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//criando uma variavel para chamar o objeto datahora e passando como parametro
		//formatada e depois usando a variavel format para imprimir 
		String format = datahora.format(formatada);
		System.out.println("data Formatada: "+ format);
	}
}
