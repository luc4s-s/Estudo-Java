package metodos;

public class SobreCargaMetodo {
	/** Autor: LUCAS GOMES 
	 *  Data: 22/03/2022**/
	
	static double teste(double x, double y) { //metodo com parametro
		return x+y;//fazendo a soma dos paramnetros
		
	}
	
	static int teste(int x, int y) {//metodo com parametro
		return x+y;//fazendo a soma dos paramnetros
	}

	public static void main(String[] args) {

		int num1 = teste(21,5);// criando uma variavel INT e atribuindo o metodo com os argumentos
		double num2 = teste(5.99,4.45);// criando uma variavel DOUBLE e atribuindo o metodo com os argumentos
		
		System.out.println("int:" + num1); //imprimindo a variavel que recebel os argumentodos do metodo 
		System.out.println("double: " + num2);//imprimindo a variavel que recebel os argumentodos do metodo
		
		
//		if(num1 < 10 || num2 < 5) {
//			System.out.println("valor inadequandro");
//		}else if (num1> 20 && num2 > 12.0){
//			System.out.println("valor adequado");
//		}
	}

}
