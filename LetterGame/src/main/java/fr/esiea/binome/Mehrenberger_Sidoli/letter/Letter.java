package fr.esiea.binome.Mehrenberger_Sidoli.letter;

public class Letter {
	
	private char valeur;
	private int poids;
	private int nbOccurences;
	
	public Letter(char valeur, int poids, int nbOccurences) {
		this.setValeur(valeur);  //ex: a  (La valeur correspond à la lettre de l'alphabet)
		this.setPoids(poids);	//ex:1 (chaque lettre a un équivalent en poids)
		this.setNbOccurences(nbOccurences); //ex:4 pour voyelle et 1 pour consonne (correspond à la fréquence d'apparition) 
	}
	
	public char getValeur(){
		return valeur;
	}
	
	public void setValeur(char valeur){
		this.valeur = valeur;
	}
	
	public int getPoids(){
		return poids;
	}
	
	public void setPoids(int poids){
		this.poids = poids;
	}
	
	public int getNbOccurences(){
		return nbOccurences;
	}
	
	public void setNbOccurences(int nbOccurences){
		this.nbOccurences = nbOccurences;
	}
}