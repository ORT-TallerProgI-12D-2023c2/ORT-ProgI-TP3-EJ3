package ejemplo;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Carta {

	private static String tipoDePapel = "Ilustracion";
	private static String patronContraCara = "****";
	private static String marca = "Casino";
	private boolean estaTapada;
		
	public Carta() {
		this.estaTapada = false;
	}

	public void darVuelta() {
		// Método a resolver...
	}

	@Override
	public String toString() {
		return "Carta [estaTapada=" + estaTapada + "]";
	}
	
	

}