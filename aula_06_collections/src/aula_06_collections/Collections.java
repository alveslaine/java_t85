package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Abacaxi", "Pera"));
		
		frutas.add("Abacate");
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Abacate");
		frutas.add("Laranja");
		frutas.add("abacate");
		frutas.addAll(listaFrutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}

		System.out.println("A fruta Laranja esta presente? " + frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
			for(String fruta : frutas) {
			System.out.println(fruta);
		}
	}

}
