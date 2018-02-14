package pruebas;

import java.util.HashSet;
import java.util.Iterator;

public class PruebaHastSet {

	public static void main(String[] args) {
		HashSet<String> conjunto = new HashSet<String>();
		conjunto.add("uno");
		conjunto.add("dos");
		conjunto.add("tres");
		conjunto.add("cuatro");
		conjunto.add("cinco");
		conjunto.add("seis");
		
		Iterator<String> it = conjunto.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		for (String numeracion : conjunto) {
			System.out.println(numeracion);
		}
	}

}
