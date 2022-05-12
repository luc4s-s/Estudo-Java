package arraylist;

import java.util.ArrayList;

public class Removendo {

	public static void main(String[] args) {

		//criando o array com o tipo e o nome do array
		ArrayList<String> carro = new ArrayList<String>();
		
		//crianado a lista de array
		carro.add("bmw");
		carro.add("fiat");
		carro.add("ford");
		
		//removendo um elemento da lista 
		carro.remove(1);
		
		//imprimindo a lista 
		System.out.println(carro);
	}

}
