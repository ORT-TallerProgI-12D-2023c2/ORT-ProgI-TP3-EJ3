package ejemplo;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class CartaComun extends Carta {

	private Palo palo;

	public CartaComun(Palo palo) {
		super();
		this.palo = palo;
	}

	public Palo getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return super.toString() + "[palo=" + palo + "]";
	}
	
	

}