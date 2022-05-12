package modificadores;

public class ModificadoresPrivados {

	//class com os atributos privaddos 
	private String nome = "lucas";
	private String Sobrenome = "gomes";
	private int idade = 22;
	public static void main(String[] args) {

		ModificadoresPrivados obj = new ModificadoresPrivados();
		
		System.out.println("Nome: " + obj.nome + obj.Sobrenome);
		System.out.println("Idade: " + obj.idade); // acessando os atributos Privados 
		
		
		
		
		
		//um teste para acessar os atributos publico de outra class
		AtributoPublico_Pessoa ob = new AtributoPublico_Pessoa();		
		System.out.println("idade: " + ob.idade);
		
	}

}
