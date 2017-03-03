package fr.esiea.binome.Mehrenberger_Sidoli.joueur;

import java.util.ArrayList;
import java.util.List;
import fr.esiea.unique.binome.name.letter.Word;

public class Joueur {
	
	private int nbMots;
	private List<Word> listeMots = new ArrayList<>();
	
	public Joueur(List<Word> listeMots) {
		this.setNbMots(0);
		this.setListeMots(listeMots);
	}
	
	public int getNbMots() {
		return nbMots;
	}
	
	public void setNbMots(int nbMots) {
		this.nbMots = nbMots;
	}
	
	////////////////VOL DES MOTS A FAIRE//////////////////////////
	//Décrémenter le nombre de mots
	public void reduce1NbMots(int nbMots){
		if(nbMots > 0){
			this.nbMots = nbMots - 1;
		}else{
			this.nbMots = nbMots;
		}
	}
	
	//Incrémenter le nombre de mots
	public void add1NbMots(int nbMots){
		this.nbMots = nbMots + 1;
	}
	
	
	public void reduceListeMots(List<Word> listeMots, Word mot){
		int i;
		for(i=0; i<listeMots.size(); i++) {
			if(listeMots.get(i).getMot() == mot.getMot()) {
				listeMots.remove(i);
				reduce1NbMots(getNbMots());
			}
		}
	}
	
	public void addListeMots(List<Word> listeMots, Word mot){
		if(this.listeMots.add(mot)){
			add1NbMots(getNbMots());
		}
	}
	
	
	public List<Word> getListeMots() {
		return listeMots;
	}
	
	public void setListeMots(List<Word> listeMots) {
		this.listeMots =listeMots;
	}

}