package arraylist;

import java.util.ArrayList;

public class AcessandoArray {

	// acessando o arraylist
	
	public static void main(String[] args) {
		//criando o array com o tipo e o nome do array
		ArrayList<String> carro = new ArrayList<String>();
		
		//crianado a lista de array
		carro.add("BMW");
		carro.add("FORD");
		carro.add("FIAT");
		
		//acessando o array
		System.out.println(carro.get(2));
	}
}
