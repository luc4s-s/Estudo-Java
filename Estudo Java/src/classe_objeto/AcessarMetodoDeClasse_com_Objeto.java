package classe_objeto;

public class AcessarMetodoDeClasse_com_Objeto {


	//metodo de class
	public void metodo1() {
		System.out.println("O carro é uma BMW ");
	}

	//metodo de class
	public void metodo2(int VELOCIDADE) {
		System.out.println("E esta a " + VELOCIDADE + "km"); //acessando o parametro

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// criando objeto de class
		AcessarMetodoDeClasse_com_Objeto obj = new AcessarMetodoDeClasse_com_Objeto();
		obj.metodo1();
		obj.metodo2(200); // acessando os metodos e passando um valor para o parametro
		
	}

}
