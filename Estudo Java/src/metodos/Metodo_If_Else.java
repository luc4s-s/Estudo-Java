package metodos;

public class Metodo_If_Else {
	/**
	 * Autor: LUCAS GOMES Data: 22/03/2022
	 **/

	static void teste(int idade) { // metodo com Parametro
		if (idade < 18) { // fazendo a compara�ao para ver se � true
			System.out.println("Acesso negado vo�� � menor de idade");
		} else {
			System.out.println("Acesso permitido Vo�� � maior de idade");
		}

	}

	public static void main(String[] args) {

		// metodo sendo chamado e passando o valor para o parametro idade
		teste(20);
	}

}
