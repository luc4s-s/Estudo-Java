package classe_objeto;

public class ConstrutorDeClass {
	int x;//atributo/variavel
	
	//criando um construtor de class
	public ConstrutorDeClass() {
		x = 5000; // passando valor para o atributo/variavel
	}

	public static void main(String[] args) {

		//objeto de class
	ConstrutorDeClass obj = new ConstrutorDeClass();
	System.out.println(obj.x);//acesando o atributo
	}

}
