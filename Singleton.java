public class Singleton {
	public static void main(String[] args) {
		// Primera instancia creada
		PaisDaoImpl dao = new PaisDaoImpl.getInstance();
	}

	for (Object obj : dao.getPaises) {
		// Imprimimos cada elemento de la lista
		System.out.println(((Pais)obj).getNombre());
	}
}