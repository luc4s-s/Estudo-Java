package metodos;

public class MetodoComParametro {
	/** Autor: LUCAS GOMES 
	 *  Data: 20/03/2022 **/

	static void teste(String nome) { //metodo com parametro
		System.out.println("meu nome é " + nome); // concatenacao com o parametro
	}
	
	public static void main(String[] args) {

		// chamada de metodos com argumentos 
		teste("lucas");
		teste("santos");
		teste("Bia");
	}

}
