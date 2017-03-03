package fr.esiea.binome.Mehrenberger_Sidoli.letter;

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
	
	public void NoAccent(char valeur) { //Cas Particulier des accents et du trait d'union
				switch(valeur) {
				case 'à': 
					this.valeur = 'a';
					break;
				case 'é': case 'è': case 'ê':
					this.valeur = 'e';
					break;
				case 'î':
					this.valeur = 'i';
					break;
				case 'ô':
					this.valeur = 'o';
					break;
				case 'ù':
					this.valeur = 'u';
					break;
				case '-':
					this.valeur = ' ';
					break;
				}
	}
}