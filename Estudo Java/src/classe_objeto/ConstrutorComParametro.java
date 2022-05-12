package classe_objeto;

public class ConstrutorComParametro {

	// atributo/variavel
	int modelAno;
	String modelNome;

	// criando construtor com parametro
	public ConstrutorComParametro(int ano, String nome) {
		modelAno = ano; // atribuindo o parameto para o atributo
		modelNome = nome;
	}

	public static void main(String[] args) {

		// criando o objeto de class e passando o valor dos atributos de class
		ConstrutorComParametro obj = new ConstrutorComParametro(1889, "bmw");
		System.out.println(obj.modelNome + " " + obj.modelAno); // acessando os atributos

	}

}
