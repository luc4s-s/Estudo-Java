package loopFor;

/** Autor: LUCAS GOMES 
 *  Data: 22/03/2022 **/

public class BreakFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i < 5; i++) { // percorre o loop ate menor que 5
			if(i == 3) { //aqui faz uma comparacao se for ingual a 3 o programa termina
				break;
			}
			System.out.println(i);
		}
	}

}
