package metodos;

public class Metodo_If_Else {
	/**
	 * Autor: LUCAS GOMES Data: 22/03/2022
	 **/

	static void teste(int idade) { // metodo com Parametro
		if (idade < 18) { // fazendo a comparaçao para ver se é true
			System.out.println("Acesso negado voçê é menor de idade");
		} else {
			System.out.println("Acesso permitido Voçê é maior de idade");
		}

	}

	public static void main(String[] args) {

		// metodo sendo chamado e passando o valor para o parametro idade
		teste(20);
	}

}
