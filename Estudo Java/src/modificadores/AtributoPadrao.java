package modificadores;

public class AtributoPadrao {
	
	// atributos PADRAO/NORMAL
	String nome = "lucas";
	String sobrenome = "gomes";
	int idade = 20;
	
//	um teste
//	int idad;

	public static void main(String[] args) {
		
		AtributoPadrao obj = new AtributoPadrao();//objeto de class 
		
		System.out.println("nome: "+ obj.nome + obj.sobrenome);
		System.out.println("idade: " + obj.idade);
		
//		//um teste para ver se iria chamar o atributo sem valor e passa o valor aqui e funciona 
//		System.out.println(obj.idad = 20);
	}

}
