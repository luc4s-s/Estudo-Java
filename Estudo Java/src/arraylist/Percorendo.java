package arraylist;

import java.util.ArrayList;

public class Percorendo {

	// percorendo toda a lista do array usando o for
	public static void main(String[] args) {

		//criando o array com o tipo e o nome do array
		ArrayList<Integer> num = new ArrayList<Integer>();

		//crianado a lista de array
		num.add(6564);
		num.add(257);
		num.add(4010);
		num.add(87645);
		num.add(145);
		num.add(344);
		num.add(434);
		num.add(4234);
		num.add(877);
		num.add(656);

		//percorendo a lista 
		for (int a = 0; a < num.size(); a++) {
			System.out.println(num.get(a));

		}

		//mostrando a quantidade de elemento 
		System.out.println();
		System.out.println("tem: " + num.size() + " array");

	}

}
