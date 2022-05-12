package arraylist;

import java.util.ArrayList;

public class PercorrendoForEach {

	//percorendo com o foreach
	public static void main(String[] args) {
		//criando o array com o tipo e o nome do array
		ArrayList<String> car = new ArrayList<String>();
		
		//crianado a lista de array
		car.add("bmw");
		car.add("fiat");
		car.add("ford");
		
		//percorendo a lista com foreach
		for(String i : car) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("quantidade de elemento: "+car.size());
	}

}
