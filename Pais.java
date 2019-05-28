/*
Puede ser cualquier lista, en este caso se utilizó Pais
*/
public class Pais {
	// atributos para los paises:
	private String nombre;

	public Pais(String nombre) {
		// Constructor que utilice la variable local nombre
		super(); // ocupar la variable general en esa clase
		//si se saca super(), puede ser utilizada la variable por otra clase
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		thisnombre = nombre;
	}
}