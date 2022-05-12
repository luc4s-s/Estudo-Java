package arraylist;

import java.util.ArrayList;

public class ObtendoTamanho {

	public static void main(String[] args) {
		//obtendo o tamanho do array
		
		//criando o array com o tipo e o nome do array
		ArrayList<Integer> numero = new ArrayList<Integer>();
		
		//crianado a lista de array
		numero.add(6464);
		numero.add(6565);
		numero.add(943);
		numero.add(648);
		numero.add(03156);
		numero.add(4616);
		numero.add(97451);
		numero.add(9840);
		numero.add(98420);
		numero.add(649);

		//capturando o tanhamo do array com o size()
		System.out.println(numero.size());
		
	}

}
