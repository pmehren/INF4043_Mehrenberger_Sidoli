package fr.esiea.binome.Mehrenberger_Sidoli.lettergameengine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.esiea.binome.Mehrenberger_Sidoli.bag.Bag;
import fr.esiea.binome.Mehrenberger_Sidoli.potcommun.PotCommun;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionary.Dictionary;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionary.IDictionary;
import fr.esiea.binome.Mehrenberger_Sidoli.joueur.Joueur;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Word;


public class LetterGameEngine {
	
	List<Word> listeMotsJ1 = new ArrayList<>();
	List<Word> listeMotsJ2 = new ArrayList<>();
	List<Letter> listePotCommun = new ArrayList<>();
	List<Letter> listBag = new ArrayList<>();
		
	Scanner reader = new Scanner(System.in);
	
	Bag bag;
	IDictionary dictionaire;	
	PotCommun PotCommun;
		
	Joueur p1 = new Joueur(listeMotsJ1);
	Joueur p2 = new Joueur(listeMotsJ2);
		
	public void main(String[] args) {
			
		initialisationGame();
		run();
	}
		
	public void initialisationGame() {
			bag = new Bag(listBag);
			dictionaire = new Dictionary();
			PotCommun = new PotCommun(listePotCommun);
			
			bag.initListeBag(listBag);
			bag.melangeListe(listBag);
			
			System.out.println("C'est au tour du Joueur 1 de piocher une lettre");
			System.out.println("C'est au tour du Joueur 2 pioche une lettre");
		}
		
		public void run() {
			while(p1.getNbMots() >= 10 || p2.getNbMots() >= 10) {
				
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
