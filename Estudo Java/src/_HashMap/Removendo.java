package _HashMap;

import java.util.HashMap;

public class Removendo {
	//A HashMap, no entanto, armazena itens em pares " chave / valor "
	public static void main(String[] args) {
		//criando o hashMap
		HashMap<String, String> CapitalCidade = new HashMap<>();
	
		//passano chave e valor
		CapitalCidade.put("B�lem", "Par�");
		CapitalCidade.put("Macap�", "Amap�");
		CapitalCidade.put("Manaus", "Amazonas");
		CapitalCidade.put("Palmas", "Tocantins");
		CapitalCidade.put("Rio Branco", "Acre");
		
		// removendo a chave como valor
		CapitalCidade.remove("B�lem");
		
		//imprimindo o a lista de chave valor
		System.out.println(CapitalCidade);
	}

}
