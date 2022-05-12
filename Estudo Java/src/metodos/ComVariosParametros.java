package metodos;

public class ComVariosParametros {
	/** Autor: LUCAS GOMES
	 *  Data:22/03/2022 **/
	static void teste(String nome, int idade) {// metodo com varios parametros
		System.out.println("Meu nome é "+nome + " tenho " + idade);// parametro sendo usado 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// chamando o metodo com os argumentos 
		teste("lucas", 22);
		teste("Douglas",10);
	}

}
