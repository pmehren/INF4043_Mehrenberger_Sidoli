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
	
	List<Word> listeMotsJ1 = new ArrayList<>();
	List<Word> listeMotsJ2 = new ArrayList<>();
	List<Letter> listePotCommun = new ArrayList<>();
	List<Letter> listeBag = new ArrayList<>();
		
	Scanner reader = new Scanner(System.in);
	
	Bag bag;
	IDictionaire dictionaire;	
	PotCommun PotCommun;
	
	int i1,i2 = 0;	
	boolean Joueur1Joue;
	Joueur p1 = new Joueur(listeMotsJ1);
	Joueur p2 = new Joueur(listeMotsJ2);
	
		
	public void initialisationGame() {
			bag = new Bag(listeBag);
			dictionaire = new Dictionaire();
			PotCommun = new PotCommun(listePotCommun);
			
			bag.initListeBag(listeBag);
			bag.melangeListe(listeBag);
			
			Letter lettre1=bag.getPremiereLettre(listeBag);
			System.out.println("C'est au tour du Joueur 1 de piocher une lettre");
			System.out.println("Joueur 1 pioche la lettre : " + lettre1.getValeur()+ "\n");
			PotCommun.addLettrePotCommun(listePotCommun, lettre1);
					
			Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
			System.out.println("C'est au tour du Joueur 2 de piocher une lettre");
			System.out.println("Joueur 2 pioche la lettre : " + lettre2.getValeur() + "\n");
			PotCommun.addLettrePotCommun(listePotCommun, lettre2);
					
			if(lettre1.getPoids() <= lettre2.getPoids()) {
					System.out.println("Joueur 1 a la plus petite lettre. Il commence");
					Joueur1Joue = true;
			} else {
					System.out.println("Joueur 2 a la plus petite lettre. Il commence");
					Joueur1Joue = false;
			}
					
			List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
			System.out.println("Pot commun : " + listeValeur);
		}
			
	
		public void run() {
			
				while(i1 <10 || i2 < 10){
					
					bag.melangeListe(listeBag);
					Letter lettre1 = bag.getPremiereLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre1);
					Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre2);
							
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
