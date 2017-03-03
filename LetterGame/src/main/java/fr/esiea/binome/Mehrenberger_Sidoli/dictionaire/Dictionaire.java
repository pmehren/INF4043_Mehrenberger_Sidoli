package fr.esiea.binome.Mehrenberger_Sidoli.dictionaire;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.Scanner;
//import fr.esiea.binome.Mehrenberger_Sidoli.letter.Letter;
import java.util.Scanner;

public class Dictionaire implements IDictionaire {
		
private static Scanner scan;
private BufferedReader buffread;

	public static void main(String[] args) {		

	}
	
	public static String removeAccent(String source) { //Permet d'enlever l'accentation des mots
			return Normalizer.normalize(source, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
	}
		
	public boolean verifyWord(String mot) { //Permet de vérifier l'existence ou non du mot dans le dictionnaire			
		try{
			FileReader fileread = new FileReader("src/main/resources/dico.txt");
			buffread = new BufferedReader(fileread);
			String s;
			String motDico = null;
			
			while((s = buffread.readLine()) != null) {
				scan = new Scanner(s);
				while (scan.hasNext()) {
					motDico = scan.next().toLowerCase();
					motDico = motDico.replace('-',' '); //On enlève les traits d'union du dico afin d'éviter des problèmes de correspondance
						if(removeAccent((motDico)).equals(mot)) { //On enlève les accents du dico afin d'éviter des problèmes de correspondance 
							System.out.println("Le mot "+ mot + " existe dans le dictionnaire");
							return true;						
						}
				}
			}
			buffread.close();
			fileread.close();
			System.out.println("Le mot " + mot + " n'existe pas dans le dictionnaire");
			return false;
		} catch (Exception e){//Catch exception if any
		System.err.println("Error: " + e.getMessage());
		}
		return false;
	}
}
