package ejerciciosPrimeraHoja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class UsoEjercicioListaCompra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<EjercicioListaCompra> listacompra = new HashSet<EjercicioListaCompra>();
		int opcion = -1;
		boolean continuar = false;
		while (!continuar) {
			System.out.println("introduce una de las siguientes obciones: ");
			System.out.println(" - Introduce 1 para insertar producto en la lista de la compra");
			System.out.println(" - Introduce 2 para eliminar producto");
			System.out.println(" - Introduce 3 para consultar la lista");
			System.out.println(" - Introduce 0 para salir");

			// leemos los datos introducidos controlando que sea lo deseado

			try {
				opcion = Integer.parseInt(sc.nextLine());

				if (opcion < 0 || opcion > 3) {
					System.out.println("\nEl valor debe ser una de las opciones");
				} else {
					// opcion valida. realizamos la accion correspondiente

					switch (opcion) {

					case 1:// sera una insercion
						insertarProducto(sc, listacompra);

						break;

					case 2:// sera eliminar
						eliminarProducto(sc, listacompra);

						break;

					case 3:// mostrar
						mostrarProducto(listacompra);

						break;

					default:// salir
						continuar = true;

						break;
					}
				}
			} catch (NumberFormatException e) {
				System.out.println("\nEl valor introducido debe ser entero");
			}

		}

		sc.close();
	}

	private static void mostrarProducto(HashSet<EjercicioListaCompra> listacompra) {
		System.out.println("\n * LISTA DE LA COMPRA * ");
		for (EjercicioListaCompra prod : listacompra) {
			System.out.println(prod);
		}
	}

	private static void eliminarProducto(Scanner sc, HashSet<EjercicioListaCompra> listacompra) {
		System.out.println("\nIntroduce el nombre dle producto a elimininar");
		String nombre = sc.nextLine();
		boolean prodEncontrado = false;
		for (int i=0;i < listacompra.size() && !prodEncontrado;i++) {
			if(listacompra.get(i).getNombre().equalsIgnoreCase(nombre)) {
				prodEncontrado = true;
				listacompra.remove(i);
			}
		}
	}

	private static void insertarProducto(Scanner sc, HashSet<EjercicioListaCompra> listacompra) {

		// solicitar los datos del producto
		System.out.println("\n\nIntroduce el nombre del producto: ");
		String nombre = sc.nextLine();

		int cantidad = 0;
		boolean valido = false;
		while (!valido) {
			System.out.println("Introduce la cantidad: ");
			try {
				cantidad = Integer.parseInt(sc.nextLine());
				if(cantidad<0) {
					System.out.println("La cantidad tiene que ser mayor que 0");
				}else {
					valido=true;
				}
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser entero");
			}
		}
		// crear un objeto de tipo producto
		EjercicioListaCompra prod= new EjercicioListaCompra(nombre, cantidad);
		

		// añadir el objeto a la lista
		listacompra.add(prod);
	}

}
