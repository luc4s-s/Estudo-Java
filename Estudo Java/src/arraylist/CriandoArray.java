package arraylist;

import java.util.ArrayList;

public class CriandoArray {
//criando uma arraylista

	public static void main(String[] args) {

		//criando o array com o tipo e o nome do array
		ArrayList<String> carro = new ArrayList<String>();

		// CRIANDO A LISTA DE CARRO
		carro.add("BMW");
		carro.add("FORD");
		carro.add("MERCEDES");
		carro.add("FIAT");
		
		//imprimindo a lista 
		System.out.println("Lista de carros: " + carro);
		
	}
}
