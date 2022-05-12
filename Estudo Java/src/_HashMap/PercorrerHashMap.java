package _HashMap;

import java.util.HashMap;

public class PercorrerHashMap {
	// A HashMap, no entanto, armazena itens em pares " chave / valor "
	public static void main(String[] args) {

		// criando o hashMap
		HashMap<String, String> CapitalCidade = new HashMap<String, String>();

		// passano chave e valor
		CapitalCidade.put("B�lem", "Par�");
		CapitalCidade.put("Macap�", "Amap�");
		CapitalCidade.put("Manaus", "Amazonas");
		CapitalCidade.put("Palmas", "Tocantins");
		CapitalCidade.put("Rio Branco", "Acre");
		CapitalCidade.put("Porto Velho", "Rond�nia ");

		//percorrendo o hashmap na estrutura foreach
		for (String a : CapitalCidade.keySet()) {
			System.out.println("Chave: " + a + " - Valor: "+ CapitalCidade.get(a));
		}
	}

}
