package fr.esiea.binome.Mehrenberger_Sidoli.letter;

public class Letter {
	
	private char valeur;
	private int poids;
	private int nbOccurences;
	
	public Letter(char valeur, int poids, int nbOccurences) {
<<<<<<< HEAD
		this.setValeur(valeur);  //ex: a  (La valeur correspond à la lettre de l'alphabet)
		this.setPoids(poids);	//ex:1 (chaque lettre a un équivalent en poids)
		this.setNbOccurences(nbOccurences); //ex:4 pour voyelle et 1 pour consonne (correspond à la fréquence d'apparition) 
=======
		this.setValeur(valeur);
		this.setPoids(poids);
		this.setNbOccurences(nbOccurences);
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
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
<<<<<<< HEAD
=======
	
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
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
}