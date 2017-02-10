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
	
	public boolean motEstBon(String mot, List<Character> listPotCommun){
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
				System.out.println("La lettre " + list.get(i) + " n'existe pas");
				return false;	
			}else réelmot = false;
		}
		System.out.println("Les lettres existent");;
		return true;
	}
}
