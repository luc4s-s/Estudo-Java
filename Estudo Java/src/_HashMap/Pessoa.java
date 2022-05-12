package _HashMap;

import java.util.HashMap;

public class Pessoa {

	public static void main(String[] args) {
		//criando o hashMap pessoas
		HashMap<String, Integer> pessoa = new HashMap<String, Integer>();
		
		//passano  chave e valor
		pessoa.put("lucas", 22);
		pessoa.put("Joao", 15);
		pessoa.put("Silvia", 20);
		
		//percorrendo a lista do hashmap
		for(String i : pessoa.keySet()) {
			System.out.println("Nome: " + i + " - Idade: " + pessoa.get(i)); //imprimindo chave valor
		}
		

	}

}
