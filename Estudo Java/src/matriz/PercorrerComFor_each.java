package matriz;

public class PercorrerComFor_each {
	/**AUTOR: LUCAS GOMES
	 * DATA: 21/03/2022
	 **/
	
	public static void main(String[] args) {
		String[] carro = {"MERCEDES", "BMW", "FORD"};
		for(String a : carro) { //percorrer os elementos do Array
		System.out.println(a);	
		
		}
		System.out.println();//pular linha 
		System.out.println("Tem: "+carro.length+ " Elementos");
		
	}

}
