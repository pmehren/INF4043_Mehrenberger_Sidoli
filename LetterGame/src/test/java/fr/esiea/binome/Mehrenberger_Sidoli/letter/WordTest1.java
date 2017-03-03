package fr.esiea.binome.Mehrenberger_Sidoli.letter;

//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.binome.Mehrenberger_Sidoli.bag.Bag;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.IDictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Word;
import fr.esiea.binome.Mehrenberger_Sidoli.potcommun.PotCommun;

//PB => les doublons

public class WordTest1 {
	
	private Word word;
	Scanner reader = new Scanner(System.in);
	
	private PotCommun commonPot;
	private List<Letter> listePotCommun = new ArrayList<>();
	
	private Bag bag;
	private List<Letter> listeBag = new ArrayList<>();
	
	private IDictionaire dictionary;
	
	@Before
	public void setup() {
		word = new Word(null);
		commonPot = new PotCommun(listePotCommun);
		dictionary = new Dictionaire();
		bag = new Bag(listeBag);
		
		bag.initListeBag(listeBag);
		bag.melangeListe(listeBag);
	}
	
	@Test
	public void LettreInPotTest() {
		Letter letter1 = bag.getPremiereLettre(listeBag);
		commonPot.addLettrePotCommun(listePotCommun, letter1);
		
		Letter letter2 = bag.getDeuxièmeLettre(listeBag);
		commonPot.addLettrePotCommun(listePotCommun, letter2);
		
		Letter letter3 = listeBag.get(2);
		commonPot.addLettrePotCommun(listePotCommun, letter3);
		
		Letter letter4 = listeBag.get(3);
		commonPot.addLettrePotCommun(listePotCommun, letter4);
		
		List<Character> listeValeur = commonPot.getListePotCommun(listePotCommun);
		System.out.println("Pot commun : " + listeValeur);
		
		System.out.println("Enter a word with common pot letters: ");
		String lemottapé = reader.nextLine();
		System.out.println("Vous avez saisi : " + lemottapé);
		
		if(word.lettreInPot(lemottapé, listeValeur)) {
			if(dictionary.isWord(lemottapé)) {
				System.out.println("Les lettres vont être supprimées du pot commun");
				if(commonPot.supLettreDuPotWord(listePotCommun, lemottapé)) {
					System.out.println("Les lettres ont été supprimées du pot commun");
					List<Character> ValeurListe2 = commonPot.getListePotCommun(listePotCommun);
					System.out.println("Pot commun : " + ValeurListe2);
				} else System.out.println("Erreur");
			} else System.out.println("Erreur");
		} else System.out.println("Erreur");
	}

}