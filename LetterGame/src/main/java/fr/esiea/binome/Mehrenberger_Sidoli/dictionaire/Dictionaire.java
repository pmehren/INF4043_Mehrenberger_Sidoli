package fr.esiea.binome.Mehrenberger_Sidoli.dictionaire;

import java.io.BufferedReader;
import java.io.FileReader;
<<<<<<< HEAD
import java.text.Normalizer;
import java.util.Scanner;
//import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
=======
import java.util.Scanner;
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b

public class Dictionaire implements IDictionaire {
		
	private static Scanner scan;
	private BufferedReader buffread;

	public static void main(String[] args) {		

	}
<<<<<<< HEAD
	
public static String removeAccent(String source) { //Permet d'enlever l'accentation des mots
			return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
}
		
public boolean verifyWord(String mot) { //Permet de vérifier l'existence ou non du mot dans le dictionnaire
			
		try{
=======

	public boolean isWord(String mot) {
			
		try{

>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			FileReader fileread = new FileReader("src/main/resources/dico.txt");
			buffread = new BufferedReader(fileread);
			String s;
			String motDico = null;
			
<<<<<<< HEAD
=======
			/*
			//Cas particulier des accents et trait d'union
				s.replace('à', 'a');
				s.replace('â', 'a');
				s.replace('é', 'e');
				s.replace('è', 'e');
				s.replace('ê', 'e');
				s.replace('î', 'i');
				s.replace('ï', 'i');
				s.replace('ô', 'o');
				s.replace('ö', 'o');
				s.replace('ù', 'u');
				s.replace('û', 'u');
				s.replace('ç', 'c');
				s.replace('-', ' ');
				
			 */
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			
			while((s = buffread.readLine()) != null) {
				scan = new Scanner(s);
				while (scan.hasNext()) {
					motDico = scan.next().toLowerCase();
<<<<<<< HEAD
					motDico = motDico.replace('-',' '); //On enlève les traits d'union du dico afin d'éviter des problèmes de correspondance
						if(removeAccent((motDico)).equals(mot)) { //On enlève les accents du dico afin d'éviter des problèmes de correspondance 
							System.out.println("Le mot "+ mot + " existe dans le dictionnaire");
							return true;						
						}
				}
			}
=======
					if(motDico.equals(mot)) {
						System.out.println("Le mot "+ mot + " existe dans le dictionnaire");
						return true;						}
					}
				}
>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
			buffread.close();
			fileread.close();
			System.out.println("Le mot " + mot + " n'existe pas dans le dictionnaire");
			return false;
<<<<<<< HEAD
=======

>>>>>>> 983f5c274c2ad13192fccf87a066f2cdff01cf7b
		} catch (Exception e){//Catch exception if any
		System.err.println("Error: " + e.getMessage());
		}
		return false;
	}
}
