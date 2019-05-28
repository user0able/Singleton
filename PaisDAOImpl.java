public class PaisDaoImpl {
	private List paises = null;

	public static PaisDaoImpl instancia = null; // hasta el momento está vacía, no se ha usado

	public static PaisDaoImpl getInstance() {
		if (instancia == null) { // si es nula, la creamos
			instancia = new PaisDaoImpl();
			return instancia; // retornar la instancia
		}
	}
	// Constructor de ambito privado, para evitar instancias adicionales
	private PaisDaoImpl() {}

	// lista hipotetica de conexión a la db

	public List getPaises() {
		// Aplicamos el patron Singleton
		if (paises == null) {
			paises = new ArrayList();	
		}
		Pais p1 = newe Pais("Chile");
		Pais p2 = newe Pais("USA");
		Pais p3 = newe Pais("Argentina");
		Pais p4 = newe Pais("China");
		Pais p5 = newe Pais("Japon");

		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		paises.add(p4);
		paises.add(p5);

		return paises; // retornamos los paises
	}
}