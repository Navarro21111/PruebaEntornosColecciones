package ejerciciosPrimeraHoja;

import java.util.ArrayList;

public class EjercicioArchivos {
/*
 * DESDE QUE EL MUNDO CAMBIO ESTAMOS MUCHOS MAS UNIDOS
 * CON LOS DIGIMON LUCHAMOS JUNTOS CONTRA EL MAL.
 * ALGO EXTRAÑO PASABA DIGIEVOLUCIONABAN EN TAMAÑO Y COLOR 
 * ELLOS SON LOS DIGIMON.
 * 
 */
	public static void main(String[] args) {
		ArrayList<Integer> archivo1 = cargarArchivo1();

		ArrayList<Integer> archivo2 = cargarArchivo2();

		ArrayList<Integer> archivo3 = cargarArchivo3();
		
		//archivo resultante
		ArrayList<Integer> archivorest = new ArrayList<Integer>();
		archivorest.addAll(archivo1);
		archivorest.addAll(archivorest.size(), archivo2);
		archivorest.addAll(archivorest.size(), archivo3);
		for (Integer i : archivorest) {
			System.out.println(i);
		}
		ordenarLista(archivorest);
		mostrarLista(archivorest);
	}

	private static ArrayList<Integer> cargarArchivo3() {
		ArrayList<Integer> archivo3 = new ArrayList<Integer>();
		archivo3.add(1);
		archivo3.add(255);
		return archivo3;
	}

	private static ArrayList<Integer> cargarArchivo2() {
		ArrayList<Integer> archivo2 = new ArrayList<Integer>();
		archivo2.add(1);
		archivo2.add(1024);
		return archivo2;
	}

	private static ArrayList<Integer> cargarArchivo1() {
		ArrayList<Integer> archivo1 = new ArrayList<Integer>();
		archivo1.add(127);
		archivo1.add(127);
		archivo1.add(255);
		archivo1.add(255);
		return archivo1;
	}

	private static void mostrarLista(ArrayList<Integer> archivorest) {
		System.out.println();
		for (Integer i : archivorest) {
			System.out.println(i);
		}
	}

	private static void ordenarLista(ArrayList<Integer> archivorest) {
		Integer aux=null;
		for (int i = 0; i < archivorest.size()-1; i++) {
			for (int j = i+1; j < archivorest.size(); j++) {
				if(archivorest.get(i) > archivorest.get(j)) {
					aux=archivorest.get(i);
					archivorest.set(i, archivorest.get(j));
					archivorest.set(j, aux);
				}
			}
		}
	}
}
