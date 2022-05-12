package Encapsulamento;

public class ClassPessoa {
	
	public static void main(String[] args) {
		
		Pessoa obj = new Pessoa();
		
		// pegando os atributos da class pessoa
		obj.setNome("Lucas ");
		obj.setSobrenome("gomes");
		obj.setIdade(22);

		//acessando os objetos 
		System.out.println("Nome"+obj.getNome() + obj.getSobrenome());
		System.out.println("Idade: "+obj.getIdade());
	}

}
