package fr.esiea.binome.Mehrenberger_Sidoli.lettergameengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

<<<<<<< HEAD
import fr.esiea.unique.binome.name.bag.Bag;
import fr.esiea.unique.binome.name.dictionaire.Dictionaire;
import fr.esiea.unique.binome.name.dictionaire.IDictionaire;
import fr.esiea.unique.binome.name.potcommun.PotCommun;
import fr.esiea.unique.binome.name.joueur.Joueur;
import fr.esiea.unique.binome.name.letter.Letter;
import fr.esiea.unique.binome.name.letter.Word;


public class LetterGameEngine {
=======
import fr.esiea.binome.Mehrenberger_Sidoli.bag.Bag;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.IDictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.potcommun.PotCommun;
import fr.esiea.binome.Mehrenberger_Sidoli.joueur.Joueur;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Word;


public class LetterGameEngine {
	
	List<Word> listeMotsJ1 = new ArrayList<>();
	List<Word> listeMotsJ2 = new ArrayList<>();
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	List<Letter> listePotCommun = new ArrayList<>();
	List<Letter> listeBag = new ArrayList<>();
		
	Scanner reader = new Scanner(System.in);
	
	Bag bag;
	IDictionaire dictionaire;	
	PotCommun PotCommun;
	
	int i1,i2 = 0;	
	boolean Joueur1Joue;
<<<<<<< HEAD
	Joueur p1 = new Joueur();
	Joueur p2 = new Joueur();
=======
	Joueur p1 = new Joueur(listeMotsJ1);
	Joueur p2 = new Joueur(listeMotsJ2);
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
	
		
	public void initialisationGame() {
			bag = new Bag(listeBag);
			dictionaire = new Dictionaire();
			PotCommun = new PotCommun(listePotCommun);
<<<<<<< HEAD
			bag.initListeBag(listeBag);
			bag.melangeListe(listeBag);
			
			//Premier tirage de lettre
=======
			
			bag.initListeBag(listeBag);
			bag.melangeListe(listeBag);
			
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			Letter lettre1=bag.getPremiereLettre(listeBag);
			System.out.println("C'est au tour du Joueur 1 de piocher une lettre");
			System.out.println("Joueur 1 pioche la lettre : " + lettre1.getValeur()+ "\n");
			PotCommun.addLettrePotCommun(listePotCommun, lettre1);
<<<<<<< HEAD
			
			//Deuxième tirage de lettre 		
=======
					
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
			System.out.println("C'est au tour du Joueur 2 de piocher une lettre");
			System.out.println("Joueur 2 pioche la lettre : " + lettre2.getValeur() + "\n");
			PotCommun.addLettrePotCommun(listePotCommun, lettre2);
<<<<<<< HEAD
			
			//Comparaison des poids & Détermination du premier à jouer 
=======
					
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			if(lettre1.getPoids() <= lettre2.getPoids()) {
					System.out.println("Joueur 1 a la plus petite lettre. Il commence");
					Joueur1Joue = true;
			} else {
					System.out.println("Joueur 2 a la plus petite lettre. Il commence");
					Joueur1Joue = false;
			}
<<<<<<< HEAD
			
			//Affichage des lettres du pot commun		
=======
					
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
			System.out.println("Pot commun : " + listeValeur);
		}
			
<<<<<<< HEAD
		
		public void run() {
			
			while(i1 <10 || i2 < 10){ //Fin du jeu lorsqu'un joueur a atteint 10mots
					
					bag.melangeListe(listeBag);//Melange aléatoirement
=======
	
		public void run() {
			
				while(i1 <10 || i2 < 10){
					
					bag.melangeListe(listeBag);
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
					Letter lettre1 = bag.getPremiereLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre1);
					Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre2);
<<<<<<< HEAD
				
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
=======
							
				if(Joueur1Joue) {
				System.out.println("==>Joueur 1 (Actif): " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2: " + p2.getNbMots() + " mots");
					if(!listeMotsJ1.isEmpty()) {
						for(int i=0; i<listeMotsJ1.size(); i++) {
							System.out.println(listeMotsJ1.get(i).getMot());
						}
					}
				} else {
				System.out.println("==>Joueur 1: " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2 (Actif): " + p2.getNbMots() + " mots");
					if(!listeMotsJ2.isEmpty()) {
						for(int i=0; i<listeMotsJ2.size(); i++) {
							System.out.println(listeMotsJ2.get(i).getMot());
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
						}
					}
				}
									
				List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
<<<<<<< HEAD
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
=======
							System.out.println("Pot commun : " + listeValeur);
							System.out.println("Entrez un mot composé avec les lettres du pot commun: ");
							
							String lemottapé = reader.nextLine();
							System.out.println("Vous avez saisi : " + lemottapé);
							
							Word word = new Word(lemottapé);
							
							if(word.lettreInPot(lemottapé, listeValeur)) {
								if(dictionaire.isWord(lemottapé)) {
									System.out.println("Les lettres vont être supprimées du pot commun");
									if(PotCommun.supLettreDuPotWord(listePotCommun, lemottapé)) {
										System.out.println("Les lettres ont été supprimées du pot commun");
										if(Joueur1Joue) {
											p1.addListeMots(listeMotsJ1, word);
											i1++;
											Joueur1Joue = false; //Le joueur1 rejoue lorsqu'il trouve un mot
										} else {
											p2.addListeMots(listeMotsJ2, word);
											i2++;
											Joueur1Joue = true; //Le joueur2 rejoue lorsqu'il trouve un mot
										}
									} else System.out.println("Erreur");
								} else System.out.println("Erreur");
							} else System.out.println("Erreur");
							
								
							Joueur1Joue = !Joueur1Joue;
			}
				if(p1.getNbMots() >=10){
				System.out.println("Bravo le joueur 1 a remporter la partie");
				}else{
				System.out.println("Bravo le joueur 2 a remporter la partie");
				}
		}
}
	
	/*private List<Player> players;
	private ILetterBag bag;
	private List<Letter> communPot = new ArrayList<>();
	
	public LetterGameEngine(List<Player> players, ILetterBag bag) {
		this.players = players;
		this.bag = bag;
	}

	public void run() {
		Collection<Player> orderedPlayer = initialize()
		<Player> iterator = new InfiniteIterator(orderedPlayer)
		while(!isGameFinish()) {
			Player currentPlayer = iterator.next();
		}
	}
	
	private boolean isGameFinish() {
		return players.stream()
				.map(Player::getWords)
				.filter(l -> l.size()>=10)
				.findAny()
				.isPresent();
	}
	
	private Collection<Player> initialize() {
		TreeMap<Letter,Player> treeMap = new TreeMap <Letter, Player>();
		players.forEach(p -> {
			Letter letter = bag.getNextLetter();
			communPot.add(letter);
			treeMap.put(letter, p);
		});	
		return treeMap.values().iterator().next();
	}
	
	*/
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
