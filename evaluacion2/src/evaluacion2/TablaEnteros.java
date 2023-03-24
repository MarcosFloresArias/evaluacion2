package evaluacion2;
/**
 * 
 * @author MARCOS FLORES
 * 
 * @see <a href="https://educacionadistancia.juntadeandalucia.es/centros/sevilla/my/"><a>
 *
 *@since 24/03/2023
 *
 *@version 1.0
 *
 */
public class TablaEnteros {
	
	private Integer[] tabla;

	TablaEnteros(Integer[] tabla) {
		if (tabla == null || tabla.length == 0)
			throw new IllegalArgumentException("No hay elementos");
		this.tabla = tabla;
	}

	// devuelve la suma de los elementos de la tabla
	/**
	 * 
	 * @return : DEVUELVE LA SUMA DE TODA LA TABLA
	 */
	public int sumaTabla() {
		int suma = 0;
		for (int i = 0; i < tabla.length; i++)
			suma += tabla[i];
		return suma;
	}

	// devuelve el mayor elemento de la tabla
	public int mayorTabla() {
		int max = -999;
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] > max)
				max = tabla[i];
		return max;
	}

	// devuelve la posici�n de un elemento cuyo valor se pasa
	public int posicionTabla(int n) {
		for (int i = 0; i < tabla.length; i++)
			if (tabla[i] == n)
				return i;
		throw new java.util.NoSuchElementException("No existe: " + n);
	}
}//
