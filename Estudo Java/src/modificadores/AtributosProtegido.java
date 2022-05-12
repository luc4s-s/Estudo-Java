package modificadores;

public class AtributosProtegido {
	
	// projeto nao esta funcionando direitooooooooooooo
	
	protected String nome = "";
	protected String sobrenome = "";
	protected int idade;
}

class Estudante extends AtributosProtegido{
	
	private int graduado;
	 
	public static void main(String[] args) {
		
		Estudante obj = new Estudante();
		
		System.out.println("Nome:"+ obj.nome + " "+ obj.sobrenome);
		System.out.println("Idade: "+ obj.idade);
		
		System.out.println("Ano de Graduação: "+ obj.graduado);
	}
}
