package fr.esiea.unique.binome.name.letter;

public class Letter {
	
	private char valeur;
	private int poids;
	private int nbOccurences;
	
	public Letter(char valeur, int poids, int nbOccurences) {
		this.setValeur(valeur);
		this.setPoids(poids);
		this.setNbOccurences(nbOccurences);
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