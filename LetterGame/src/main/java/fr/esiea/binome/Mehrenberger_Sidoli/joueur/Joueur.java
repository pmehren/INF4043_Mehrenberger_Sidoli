package fr.esiea.binome.Mehrenberger_Sidoli.joueur;

import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Word;

public class Joueur {
	
private int nbMots;
private List<Word> listeMots = new ArrayList<>();
	
	public Joueur() {
		this.setNbMots(0);
		this.setListeMots(new ArrayList());
	}
	
	public List<Word> getListeMots() {
		return listeMots;
	}
	
	public void setListeMots (List<Word> listeMots){
		this.listeMots = listeMots;		
=======
import fr.esiea.unique.binome.name.letter.Word;

public class Joueur {
	
	private int nbMots;
	private List<Word> listeMots = new ArrayList<>();
	
	public Joueur(List<Word> listeMots) {
		this.setNbMots(0);
		this.setListeMots(listeMots);
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	}
	
	public int getNbMots() {
		return nbMots;
	}
	
	public void setNbMots(int nbMots) {
		this.nbMots = nbMots;
	}
	
<<<<<<< HEAD
////////////////VOL DES MOTS A FAIRE//////////////////////////
//Création d'un tableau de mots caché (tout les mots validés) maximum 19mots
/*


public static int AutorisationDuMot(String word) { //Vérifie si le mot a déjà été utilisé
	boolean bool;
	int flag=0;
	try {
		for(int i=0;i<superTab.length;i++) {	
			if(superTab[i] != null ) {
				bool = word.contains(superTab[i]);
				if(bool == true) {
					flag=1;
					break;
				}
			}
		}
	}
	catch (Exception e) {
		System.out.println(e.toString());
	}	
	return flag;
}
	
public static void RemplirSuperTab(String mot) { 
		
	int i;
	int flag =0;
	try {
		for(i=0; i < superTab.length; i++) {
			if(superTab[i] == null && flag == 0) {
				superTab[i] = mot;
				flag = 1;	
			}
		}
	}
	catch (Exception e) {
		System.out.println(e.toString());
	}	
}
*/

=======
	////////////////VOL DES MOTS A FAIRE//////////////////////////
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	//Décrémenter le nombre de mots
	public void reduce1NbMots(int nbMots){
		if(nbMots > 0){
			this.nbMots = nbMots - 1;
		}else{
			this.nbMots = nbMots;
<<<<<<< HEAD
		}	
=======
		}
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
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
<<<<<<< HEAD
=======
	
	
	public List<Word> getListeMots() {
		return listeMots;
	}
	
	public void setListeMots(List<Word> listeMots) {
		this.listeMots =listeMots;
	}

>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
}