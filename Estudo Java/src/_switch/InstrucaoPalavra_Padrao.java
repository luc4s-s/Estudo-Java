package _switch;

/** Autor: LUCAS GOMES 
 *  Data: 22/03/2022**/

public class InstrucaoPalavra_Padrao {
	public static void main(String[] args) {
		
		int data = 0;
		switch(data) {
		case 1: //caso essa instrucao seja verdadeira vai cair nessa unstrucao e sera encerrado 
			System.out.println("Bom Dia"); 
			break;
		case 2:
			System.out.println("Boa Tarde");
			break;
		case 3:
			System.out.println("Boa noite");
			break;
			default:
				System.out.println("Boa madrugada");
		}
	}

}
