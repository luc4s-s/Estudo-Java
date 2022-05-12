package _HashMap;

import java.util.HashMap;

public class Tamanho {
	//A HashMap, no entanto, armazena itens em pares " chave / valor "
	public static void main(String[] args) {
		//criando o hashMap
		HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
		
		//passano  chave e valor
		num.put(10, 50);
		num.put(180, 520);
		num.put(45, 570);
		num.put(170, 580);
		num.put(110, 590);
		
		System.out.println("Chave valor: "+ num + "\n"); //imprimindo Chave valor

		System.out.println("Chave: " + num.keySet() + "\n");//acessando todas chave	

		System.out.println("Valor: " +num.values() + "\n");//acessando todos valor

		System.out.println("tamanho do HashMap: "+num.size() + "\n"); //tamanho do HashMap

		
 	}

}
