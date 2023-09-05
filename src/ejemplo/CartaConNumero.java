package ejemplo;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class CartaConNumero extends CartaComun {

	private int numero;
	
	public CartaConNumero(int numero, Palo palo) {
		super(palo);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return super.toString() + "[numero=" + numero + "]";
	}
	
	
	
}