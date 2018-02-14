package ejerciciosPrimeraHoja;

public class EjercicioListaCompra {
	
	private String nombre;
	private int cantidad;
	
	public  EjercicioListaCompra(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "---[nombre=" + nombre + ", cantidad=" + cantidad + "]\n";
	}
	

}
