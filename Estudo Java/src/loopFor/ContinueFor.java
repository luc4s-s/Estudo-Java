package loopFor;

 /** Autor: LUCAS GOMES 
  * Data: 22/03/2022 **/

public class ContinueFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int j=0; j<10; j++) {
			if(j == 5) {
				continue; //se j for ingual a 5 ele continua 
			}
			System.out.println(j);
		}
	}

}
