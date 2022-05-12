package _HashMap;

import java.util.HashMap;

public class CriarHashMap {
	//A HashMap, no entanto, armazena itens em pares " chave / valor "
	
	public static void main(String[] args) {
		//criando o hashMap CapitalCidade
		HashMap<String, String> CapitalCidade = new HashMap<String, String>();
		
		//passano  chave e valor
		CapitalCidade.put("Bélem", "Pará");
		CapitalCidade.put("Macapá", "Amapá");
		CapitalCidade.put("Manaus", "Amazonas");
		CapitalCidade.put("Palmas", "Tocantins");
		CapitalCidade.put("Rio Branco", "Acre");
		CapitalCidade.put("Porto Velho", "Rondônia ");

		//imprimindo o a lista 
		System.out.println(CapitalCidade);
	}

}
