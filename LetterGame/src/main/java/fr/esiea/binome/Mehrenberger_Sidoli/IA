package fr.esiea.binome.Mehrenberger_Sidoli.IA;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import fr.esiea.binome.Mehrenberger_Sidoli.bag.Bag;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.IDictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.potcommun.PotCommun;
import fr.esiea.binome.Mehrenberger_Sidoli.joueur.Joueur;
import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
//import fr.esiea.unique.binome.name.letter.Word;

public class IA {
	List<Letter> listePotCommun = new ArrayList<>();
	List<Letter> listeBag = new ArrayList<>();

	Scanner reader = new Scanner(System.in);

	Bag bag;
	IDictionaire dictionaire;
	PotCommun PotCommun;

	int i1, i2 = 0;
	boolean Joueur1Joue;
	Joueur p1 = new Joueur();
	Joueur pIA = new Joueur();

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
					System.out.println("Joueur IA a la plus petite lettre. Il commence");
					Joueur1Joue = false;
			}
			
			//Affichage des lettres du pot commun		
			List<Character> listeValeur = PotCommun.getListePotCommun(listePotCommun);
			System.out.println("Pot commun : " + listeValeur);
			System.out.println("Je suis navré nous n'avons pas reussi à faire un IA");
		}
			
		
		public void run() {
			/*
			
			while(i1 <10 || i2 < 10){ //Fin du jeu lorsqu'un joueur a atteint 10mots
					
					bag.melangeListe(listeBag);//Melange aléatoirement
					Letter lettre1 = bag.getPremiereLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre1);
					Letter lettre2 = bag.getDeuxièmeLettre(listeBag);
					PotCommun.addLettrePotCommun(listePotCommun, lettre2);
				
				if(Joueur1Joue) { //JOUEUR 1 joue
				System.out.println("==>Joueur 1 (Actif): " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2: " + pIA.getNbMots() + " mots");
					if(!p1.getListeMots().isEmpty()) {
						for(int i=0; i<p1.getListeMots().size(); i++) {
							System.out.println(p1.getListeMots().get(i).getMot());
						}
					}
				} else { //JOUEUR IA joue
				System.out.println("==>Joueur 1: " + p1.getNbMots() + " mots");
				System.out.println("==>Joueur 2 (Actif): " + pIA.getNbMots() + " mots");
					if(!pIA.getListeMots().isEmpty()) {
						for(int i=0; i<pIA.getListeMots().size(); i++) {
							System.out.println(pIA.getListeMots().get(i).getMot());
						}
					}
				}
									
				try{
					InputStream instream = new FileInputStream(dico.txt);
					InputStreamReader ipsread=new InputStreamReader(instream);
					BufferedReader bread =new BufferedReader(ipsread);
			
			while((line=bread.readLine())!=null) {
				StringTokenizer stoken = new StringTokenizer(line);
				...
	*/} 
}
