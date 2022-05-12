package metodos;

public class MetodoComRetorno {
/** Autro: LUCAS GOMES
 *  Data:22/03/2022 **/
	
	// metodo de class
	static int num(int x) { // metodo com parametro
		return 50 + x; // retorno do metodo sera uma soma entre 50 e o valor que vai ser passado para x
	}

	public static void main(String[] args) {

		System.out.println(num(50)); // chamando o metodo e passando o valor para ele 
	}

}
