package arraylist;

import java.util.ArrayList;

public class TodosElementos {

	public static void main(String[] args) {
		// criando o array com o tipo e o nome do array
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		// crianado a lista de array
		myNumbers.add(10);
		myNumbers.add(15);
		myNumbers.add(20);
		myNumbers.add(25);
		System.out.println("Elemento Do tipo int");
		// percorrendo a lista
		for (int i : myNumbers) {
			System.out.println(i);
		}

		System.out.println();
		ArrayList<Double> flu = new ArrayList<Double>();
		flu.add(3.0);
		flu.add(38.0);
		flu.add(83.0);
		System.out.println("Elemento Do tipo double");
		for (Double i : flu) {
			System.out.println(i);
		}

		System.out.println();
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Elemento Do tipo String");
		for (String i : cars) {
			System.out.println(i);
		}
	}

}
