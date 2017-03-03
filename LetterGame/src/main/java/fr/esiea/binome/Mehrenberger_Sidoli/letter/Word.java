package fr.esiea.binome.Mehrenberger_Sidoli.letter;

import java.util.ArrayList;
import java.util.List;

public class Word {

	private String mot;
	
	public Word(String mot){
		this.setMot(mot);
	}
	
	public String getMot(){
		return mot;
	}
	
	public void setMot(String mot){
		this.mot = mot;
	}
	
<<<<<<< HEAD
	public boolean lettreInPot(String mot, List<Character> listPotCommun){ //Permet de vérifier si les lettres utilisés sont bien dans le pot commun
=======
	public boolean lettreInPot(String mot, List<Character> listPotCommun){
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
		boolean réelmot = false;
		List<Character> list = new ArrayList<>();
		
		for(char c : mot.toCharArray()){
			list.add(c);
		}
		
		for(int i=0; i<list.size(); i++){
			for(int j=0; j<listPotCommun.size(); j++){
				if(list.get(i) == listPotCommun.get(j) && réelmot == false){
					réelmot = true;
				} else continue;
			} if(réelmot == false){
				System.out.println("La lettre " + list.get(i) + " ne se trouve pas dans le pot");
				return false;	
			}else réelmot = false;
		}
		System.out.println("Toutes les lettres utilisés sont dans le pot");;
		return true;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
