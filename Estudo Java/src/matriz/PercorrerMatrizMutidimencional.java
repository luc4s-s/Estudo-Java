package matriz;

public class PercorrerMatrizMutidimencional {

	/** Autor: LUCAS GOMES
	 *Data: 21/03/2022**/
	public static void main(String[] args) {
		
		//para percorrer todos os Array
		int[][] num = {{1,2,3,4},{5,6,7,8}};
		for(int a= 0; a < num.length; a++) {
			for(int b = 0; b < num[a].length; b++) {
				System.out.println(num[a][b]);
			}
		}
	}
}
