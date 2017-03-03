package fr.esiea.binome.Mehrenberger_Sidoli.lettergameengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.esiea.binome.Mehrenberger_Sidoli.bag.Bag;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.IDictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.potcommun.PotCommun;
import fr.esiea.binome.Mehrenberger_Sidoli.joueur.Joueur;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Word;


public class LetterGameEngine {
	List<Letter> listePotCommun = new ArrayList<>();
	List<Letter> listeBag = new ArrayList<>();
		
	Bag bag;
	boolean Joueur1Joue; //
	int i1,i2 = 0;	
	IDictionaire dictionaire;	
	PotCommun PotCommun;
	Scanner reader = new Scanner(System.in);
	Joueur p1 = new Joueur();
	Joueur p2 = new Joueur();	
		
	public void initialisationGame() {
		bag = new Bag(listeBag);
		dictionaire = new Dictionaire();
		PotCommun = new PotCommun(listePotCommun);
		bag.initListeBag(listeBag);
		bag.melangeListe(listeBag);
		
		//Premier tirage de lettre
		Letter lettre1=bag.getPremiereLettre(listeBag);
		System.out.println("C'est au tour du Joueur 1 de piocher une lettre");
		System.out.println("Joueur 1 pioche la lettre : " + lettre1.getValeur()+ "\n");
		PotCommun.addLettrePotCommun(listePotCommun, lettre1);
		
		//Deuxième tirage de lettre 		
		Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
		System.out.println("C'est au tour du Joueur 2 de piocher une lettre");
		System.out.println("Joueur 2 pioche la lettre : " + lettre2.getValeur() + "\n");
		PotCommun.addLettrePotCommun(listePotCommun, lettre2);
	
		//Comparaison des poids & Détermination du premier à jouer 
		if(lettre1.getPoids() <= lettre2.getPoids()) {
				System.out.println("Joueur 1 a la plus petite lettre. Il commence");
				Joueur1Joue = true;
		} else {
				System.out.println("Joueur 2 a la plus petite lettre. Il commence");
				Joueur1Joue = false;
		}
	
		//Affichage des lettres du pot commun				
		List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
		System.out.println("Pot commun : " + listeValeur);
	}
				
	public void run() {	
		while(i1 <10 || i2 < 10){ //Fin du jeu lorsqu'un joueur a atteint 10mots
			bag.melangeListe(listeBag);//Melange aléatoirement
			Letter lettre1 = bag.getPremiereLettre(listeBag);
			PotCommun.addLettrePotCommun(listePotCommun, lettre1);
			Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
			PotCommun.addLettrePotCommun(listePotCommun, lettre2);

			if(Joueur1Joue) { //JOUEUR 1 joue
				System.out.println("==>Joueur 1 (Actif): " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2: " + p2.getNbMots() + " mots");
					if(!p1.getListeMots().isEmpty()) {
						for(int i=0; i<p1.getListeMots().size(); i++) {
							System.out.println(p1.getListeMots().get(i).getMot());
						}
					}
			} else { //JOUEUR 2 joue
				System.out.println("==>Joueur 1: " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2 (Actif): " + p2.getNbMots() + " mots");
					if(!p2.getListeMots().isEmpty()) {
						for(int i=0; i<p2.getListeMots().size(); i++) {
							System.out.println(p2.getListeMots().get(i).getMot());
						}
					}
				}
									
				List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
					System.out.println("Pot commun : " + listeValeur);
					System.out.println("Entrez un mot composé avec les lettres du pot commun: ");		
					String lemottapé = reader.nextLine();
					System.out.println("Vous avez saisi : " + lemottapé);
							
					Word word = new Word(lemottapé);
							
					if(word.lettreInPot(lemottapé, listeValeur)) {
						if(dictionaire.verifyWord(lemottapé)) {
							System.out.println("Les lettres entrées vont être supprimées du pot commun");
							if(PotCommun.supLettreDuPotWord(listePotCommun, lemottapé)) {
								//System.out.println("Les lettres ont été supprimées du pot commun");
								if(Joueur1Joue) {
									p1.addListeMots(p1.getListeMots(), word);
									i1++;
									Joueur1Joue = false; //Le joueur1 rejoue lorsqu'il trouve un mot grace à un booléen
								} else {
									p2.addListeMots(p2.getListeMots(), word);
									i2++;
									Joueur1Joue = true; //Le joueur2 rejoue lorsqu'il trouve un mot grace à un booléen
								}
							} else System.out.println("[Erreur de supression]");
						} else System.out.println("[Erreur: Le mot n'est pas dans le dictionnaire]");
					} else System.out.println("[Erreur: Une lettre n'est pas dans le pot]");
										
					Joueur1Joue = !Joueur1Joue;//Permet d'alterner entre les 2 joueurs
			}
			if(p1.getNbMots() >=10){
			System.out.println("Bravo le joueur 1 a remporter la partie");
			}else{
			System.out.println("Bravo le joueur 2 a remporter la partie");
			}
	}
}
