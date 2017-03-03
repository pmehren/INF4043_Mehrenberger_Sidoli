package fr.esiea.binome.Mehrenberger_Sidoli.bag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;

public class Bag {
	private List<Letter> liste = new ArrayList<>();
	
	public Bag(List<Letter> liste) {
		this.setListe(liste);
	}
	
<<<<<<< HEAD
	public List<Letter> getListe() {
		return liste;
	}
		
	public void setListe(List<Letter> liste) {
		this.liste = liste;
	}
	
=======
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	public Letter getPremiereLettre(List<Letter> liste) {
		return liste.get(0);
	}
	
	public Letter getDeuxièmeLettre(List<Letter> liste) {
		return liste.get(1);
	}
	
<<<<<<< HEAD
	public void initListeBag(List<Letter> liste){ //Permet de réguler l'apparition des voyelles et consonnes
=======
	public void initListeBag(List<Letter> liste){
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
		for(int i=0; i<26; i++) {
			if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20 || i == 24) //Si c'est une voyelle
			{
				for(int j=0; j<3; j++) {
<<<<<<< HEAD
					Letter l = new Letter((char)(i+97), i, 3); //+97 correspond à l'alphabet (minuscules) en table ascii.
					//On initialise le nbOccurence des voyelles à 4 afin qu'il y est 4fois plus de voyelles que de consonnes.
=======
					Letter l = new Letter((char)(i+97), i, 4); //+97 correspond à l'alphabet (minuscules) en table ascii
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
					liste.add(l);
				}
			}
			Letter l = new Letter((char)(i+97), i, 1);
			liste.add(l);
		}
	}
<<<<<<< HEAD
		
=======
	
	public int getTailleBag(List<Letter> liste) {
		return liste.size();
	}
			
	public Letter getLetterBag(List<Letter> liste, int index) {
		return liste.get(index);
	}
	
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	public List<Character> getBagListe(List<Letter> liste) {
				List<Character> valeurListe = new ArrayList<>();
				
				for(int i=0; i<liste.size(); i++) {
					valeurListe.add(liste.get(i).getValeur());
				}	
			return valeurListe;	
	}
<<<<<<< HEAD
	
	
			
	
	public void melangeListe(List<Letter> liste) { //Permet de mélanger la liste de façon aléatoire
		Collections.shuffle(liste);
	}
=======
			
	
	public void melangeListe(List<Letter> liste) {
		Collections.shuffle(liste);
	}
		
	public List<Letter> getListe() {
		return liste;
	}
		
	public void setListe(List<Letter> liste) {
		this.liste = liste;
	}
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
}
