package _HashMap;

import java.util.HashMap;
//A HashMap, no entanto, armazena itens em pares " chave / valor "
public class Acessando {

	public static void main(String[] args) {
		//criando o hashMap
		HashMap<String, String> capitalcidade = new HashMap<String, String>();
		
		        //passano  chave e valor
		capitalcidade.put("B�lem", "Par�");
		capitalcidade.put("Macap�", "Amap�");
		capitalcidade.put("Manaus", "Amazonas");
		
		System.out.println(capitalcidade.get("B�lem"));//acessando  chave

	}

}
