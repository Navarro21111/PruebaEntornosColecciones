package pruebas;

import java.util.ArrayList;

public class PruebaArrayList {
//Clase para crear listas de array
	public static void main(String[] args) {
		ArrayList<String> listaCadenas = new ArrayList<String>();
		
		System.out.println("Tamaño de la lista al principio: " + listaCadenas.size());

		listaCadenas.add("Primera cadena");
		listaCadenas.add("Segunda cadena");
		listaCadenas.add("Cuarta cadena");
		//metodo set sobreescribe
		

		
		System.out.println("Tamaño de la lista: " + listaCadenas.size());
		
		

		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.println(listaCadenas.get(i));
		}
		
		listaCadenas.set(1, "Segunda cadena");
		listaCadenas.add(2, "Tercera cadena");
		
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		
		for (String cadena : listaCadenas) {
			System.out.println(cadena);
		}
		
		if(listaCadenas.contains("Segunda cadena")) {
			System.out.println("\nContiene Segunda cadena" );
		}
	}

}
