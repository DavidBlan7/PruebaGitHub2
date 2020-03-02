package ejercicio3;

public class Persona {

	private String nombre;
	private int edad;
	private String telefono;
	private String lugar;

	public Persona(String nombre, int edad, String telefono, String lugar) {
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return telefono + "\t" + edad + "\t" + nombre + "\t" + lugar;
	}

}
