package matriz;

public class AlterarElemento {
	/** lucas_gomes
	 * 21/03/2022
	 *  **/

	public static void main(String[] args) {
		// MATRIZ TIPO STRING
		String[] carros = {"BMW", "FROD", "FIAT"};
		carros[2] = "JAGUAR";
		System.out.println(carros[2]);
		
		
		// MATRIZ DO TIPO INT
		int[] numero = {10, 20, 30, 40, 60};
		numero[4] = 50;
		System.out.println(numero[4]);
	}
}
