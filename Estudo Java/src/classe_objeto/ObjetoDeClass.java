package classe_objeto;

/**
 * Autor: LUCAS GOMES 
 * Data: 22/03/2022
 */

public class ObjetoDeClass {
	int x = 10; // variavel / atributo

	public static void main(String[] args) {

		//objeto de class usa o nome da class cria o objeto (OBJ)
		ObjetoDeClass OBJ = new ObjetoDeClass(); 
		System.out.println(OBJ.x); //usa o objeto para acessar o atributo
	}

}
