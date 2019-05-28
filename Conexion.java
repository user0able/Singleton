public class Conexion {
	// Instancia unica para este patron
	private static Conexion instancia = null;
	// Como es la primera en null, va a crear una nueva para cada usuario

	public static Conexion getInstance(){
		// Ver si la conexión es la primera que nos conectamos o no..
		if (instancia == null) { // Comprobando si es la primera conexión
			instancia = new Conexion(); // crear una nueva conexión
		}
		return instancia;
	}
	/* 
	 Se podría dejar así, siempre y cuando exista un solo usuario
	 pero si se van a conectar muchas personas, se crearía n conexiones (eso es un problema)
	 la idea ahora, es crear solo una conexión, que se utilice para todas las conexiones
	*/

	 // Constructor privado que nos asegura una unica conexión
	 private Conexion(){} // así nos aseguramos que se devuelva solo una instancia

}