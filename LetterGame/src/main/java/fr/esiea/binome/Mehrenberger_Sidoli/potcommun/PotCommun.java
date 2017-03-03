package fr.esiea.binome.Mehrenberger_Sidoli.potcommun;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;

public class PotCommun {
private List<Letter> liste = new ArrayList<>();
	
	public PotCommun(List<Letter> liste){
		this.setList(liste);
	}
	
	public List<Letter> getList() {
		return liste;
	}
	
	public void setList(List<Letter> liste){
		this.liste=liste;
	}
	
	public void addLettrePotCommun (List<Letter> liste, Letter lettre){
		liste.add(lettre);
	}
	
	public List<Character> getListePotCommun(List<Letter> liste) {
				List<Character> listeValeur = new ArrayList<>();
				
				for(int i=0; i<liste.size(); i++) {
					listeValeur.add(liste.get(i).getValeur());
				}
				
		return listeValeur;
	}
		
	public boolean supLettreDuPot(List<Letter> liste, char lettre) {
		for(int i=0; i<liste.size(); i++) {
			if(liste.get(i).getValeur() == lettre) {
				liste.remove(i);
				System.out.println("Lettre supprimée du pot commun");
				return true;
			}
		}
		System.out.println("La lettre n'existe pas dans le pot commun");
		return false;
	}
			
	public boolean supLettreDuPotWord(List<Letter> liste, String mot) {	
				List<Character> listeCharWord = new ArrayList<>();
				for(char c : mot.toCharArray()) {
					listeCharWord.add(c);
				}
				
				for(int i=0; i<listeCharWord.size(); i++) {
					for(int j=0; j<liste.size(); j++) {
						if(liste.get(j).getValeur() == listeCharWord.get(i)) {
							liste.remove(j);
							System.out.println("Lettre supprimée du pot commun");
						}
					}
				}
	return true;
	}
}
