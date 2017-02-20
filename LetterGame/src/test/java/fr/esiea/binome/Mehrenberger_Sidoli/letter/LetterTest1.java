package fr.esiea.binome.Mehrenberger_Sidoli.letter;

import org.junit.Before;
import org.junit.Test;

public class LetterTest1 {
	private Letter l1;
	private Letter l2;
	 		
	@Before
	 public void setup() {
		l1 = new Letter('a', 1, 4);
 		l2 = new Letter('z', 26, 1);
 	}
	 	
 	@Test
 	public void testLetter() {
 		System.out.println("l1 valeur : " + l1.getValeur());
 		System.out.println("l1 poids : " + l1.getPoids());
	 	System.out.println("l1 occu : " + l1.getNbOccurences());
	 		
	 	System.out.println("l2 valeur : " + l2.getValeur());
	 	System.out.println("l2 poids : " + l2.getPoids());
	 	System.out.println("l2 occu : " + l2.getNbOccurences());
	}
}
