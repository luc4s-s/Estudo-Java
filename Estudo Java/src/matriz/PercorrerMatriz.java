package matriz;

public class PercorrerMatriz {
	/**
	 * AUTOR: LUCAS GOMES 
	 * DATA: 21/03/2022
	 **/
	public static void main(String[] args) {

		String[] carro = { "BMW", "FORD", "FIAT" };
		for (int i = 0; i < carro.length; i++){// percorre todos elemento do Array
			System.out.println(carro[i]);
		}
		
		System.out.println("Tem: "+ carro.length + " Elemento");// mostra a quantidade de elemneto

	}

}
