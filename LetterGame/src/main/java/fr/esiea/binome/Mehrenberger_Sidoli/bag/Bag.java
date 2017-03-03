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
	
	public List<Letter> getListe() {
		return liste;
	}
		
	public void setListe(List<Letter> liste) {
		this.liste = liste;
	}
	
	public Letter getPremiereLettre(List<Letter> liste) {
		return liste.get(0);
	}
	
	public Letter getDeuxièmeLettre(List<Letter> liste) {
		return liste.get(1);
	}
	
	public void initListeBag(List<Letter> liste){ //Permet de réguler l'apparition des voyelles et consonnes
		for(int i=0; i<26; i++) {
			if(i == 0 || i == 4 || i == 8 || i == 14 || i == 20 || i == 24) //Si c'est une voyelle
			{
				for(int j=0; j<3; j++) {
					Letter l = new Letter((char)(i+97), i, 3); //+97 correspond à l'alphabet (minuscules) en table ascii.
					//On initialise le nbOccurence des voyelles à 4 afin qu'il y est 4fois plus de voyelles que de consonnes.
					liste.add(l);
				}
			}
			Letter l = new Letter((char)(i+97), i, 1);
			liste.add(l);
		}
	}
		
	public List<Character> getBagListe(List<Letter> liste) {
				List<Character> valeurListe = new ArrayList<>();
				
				for(int i=0; i<liste.size(); i++) {
					valeurListe.add(liste.get(i).getValeur());
				}	
			return valeurListe;	
	}
	
	
			
	
	public void melangeListe(List<Letter> liste) { //Permet de mélanger la liste de façon aléatoire
		Collections.shuffle(liste);
	}
}
