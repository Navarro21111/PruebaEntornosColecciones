package pruebas;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class PruebaMap {

	public static void main(String[] args) {
		// para un map no se puede utilizar tipos primitivos
		TreeMap<Integer, String> alumnos = new TreeMap<Integer, String>();

		alumnos.put(1111, "Alberto");
		alumnos.put(2222, "Eustaquio");
		alumnos.put(3333, "Pedro");
		alumnos.put(4444, "Aurelio");
		alumnos.put(2222, "Pablo");
		alumnos.putIfAbsent(1111, "Pepe");
		//para mostrar el numero de la clave
		for (Integer i : alumnos.keySet()) {
			System.out.println(i);
		}
		//para mostrar los nombres
		System.out.println();
		for (String s : alumnos.values()) {
			System.out.println(s);

		}
		//para mostrar ambas
		System.out.println();
		for (Entry<Integer, String> e : alumnos.entrySet()) {
			System.out.println(e.getKey() + " --> " + e.getValue());
		}
		System.out.println("--------------------------------------------------------");
		
		// para un map no se puede utilizar tipos primitivos
		HashMap<Integer, String> alumnos2 = new HashMap<Integer, String>();

		alumnos2.putAll(alumnos);
		//para mostrar el numero de la clave
		for (Integer i : alumnos2.keySet()) {
			System.out.println(i);
		}
		//para mostrar los nombres
		System.out.println();
		for (String s : alumnos2.values()) {
			System.out.println(s);

		}
		//para mostrar ambas
		System.out.println();
		for (Entry<Integer, String> e : alumnos2.entrySet()) {
			System.out.println(e.getKey() + " --> " + e.getValue());
		}
	}
}
