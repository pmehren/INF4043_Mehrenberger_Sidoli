package fr.esiea.binome.Mehrenberger_Sidoli.dictionary;

import java.io.*;
import java.util.*;

public class Dictionary implements IDictionary {
		
	private static Scanner scan;
	private BufferedReader buffread;

	public static void main(String[] args) {		

	}

	public boolean isWord(String mot) {
			
		try{

			FileReader fileread = new FileReader("src/main/resources/dico.txt");
			buffread = new BufferedReader(fileread);
			String s;
			String motDico = null;

			while((s = buffread.readLine()) != null) {
				
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
				
				scan = new Scanner(s);
				while (scan.hasNext()) {
					motDico = scan.next().toLowerCase();
					if(motDico.equals(mot)) {
						System.out.println("Le mot "+ mot + " existe dans le dictionnaire");
						return true;						}
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
