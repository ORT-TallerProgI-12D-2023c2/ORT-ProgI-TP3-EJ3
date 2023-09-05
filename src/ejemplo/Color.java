package ejemplo;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public enum Color {

	ROJO("#FF0000"),
	NEGRO("#000000");
	
	private String valorHex;
	
	private Color(String valorHex) {
		this.valorHex = valorHex;
	}

}