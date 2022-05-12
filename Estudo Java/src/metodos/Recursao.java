package metodos;

public class Recursao {
	/** Autor: lucas gomes
	 *  Data:22/03/2022 **/

	public static void main(String[] args) {

		int resultado=sum(10);
		System.out.println(resultado);
	}
	public static int sum(int k) {
		if(k > 0) {
			return k + sum (k-1);

		}else {
			return 0;
		}
		
	}

}
