package projetos;

public class metodos {
	int data = 10;
	static void metodo(){
		System.out.println("oiiiiiiii");
		
	}

	public static void main(String[] args) {
	
		int mes = 10;
		String nome = "lucas";
		String email= "lucas@000";
		
		metodo(); // chamada de metodo
		metodos teste = new metodos();
		System.out.println("data: " + teste.data); // chamada de atributos com o .
		
		System.out.println("mês: "+ mes);
		System.out.println("Email: "+ email);
		System.out.println("Nome: "+ nome);

	}
}
