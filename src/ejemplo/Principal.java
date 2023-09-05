package ejemplo;

import java.util.ArrayList;
import java.util.Collections;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Carta> mazo = new ArrayList<>();
		
		mazo.add( new CartaConNumero(10, Palo.DIAMANTE) );
		mazo.add( new CartaConLetra(Letra.J, Palo.PICAS) );
		mazo.add( new Joker() );
		mazo.add( new CartaConNumero(2, Palo.TREBOL) );
		
		Collections.shuffle(mazo);
		
		for (Carta carta : mazo) {
			/*if (carta instanceof CartaConNumero) {
				System.out.println(((CartaConNumero) carta).getNumero());				
			}*/
			System.out.println(carta);
		}
		
	}

}