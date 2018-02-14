package ejerciciosPrimeraHoja;

import java.util.TreeMap;
import java.util.Map.Entry;

public class MapSeleccion {

	public static void main(String[] args) {
		TreeMap<Integer, String> seleccion = new TreeMap<Integer, String>();
		seleccion.put(1, "Casillas");
		seleccion.put(3, "Pique");
		seleccion.put(5, "Puyol");
		seleccion.put(6, "Iniesta");
		seleccion.put(7, "Villa");
		seleccion.put(8, "Xavi Hernandez");
		seleccion.put(11, "Capdevilla");
		seleccion.put(14, "Xabi Alonso");
		seleccion.put(15, "Ramos");
		seleccion.put(16, "Busquets");
		seleccion.put(7, "Pedrito");
		for (Entry<Integer, String> e : seleccion.entrySet()) {
			System.out.println(e.getKey() + " --> " + e.getValue());
		}
		
	}

}
