package fr.esiea.binome.Mehrenberger_Sidoli.dictionaire;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;

public class DicoTest {

	private Dictionaire dico;
	
	@Before
	public void init(){	
		this.dico = new Dictionaire();	
	}
	
	@Test
	public void fichierSourceDictionaireTest(){
		
		BufferedReader br;
		String ligne;
		try {
			br = new BufferedReader(new FileReader("src/main/resources/dico.txt"));
			ligne = br.readLine();
			assertEquals("a", ligne);
			
		} catch (FileNotFoundException nofile) {
			nofile.printStackTrace();
			fail("Pas de fichier");
			
		} catch (IOException error) {	
			error.printStackTrace();
			fail("Fichier non lu");	
		}	
	}

	@Test
	public void dictionaireRechercheTest(){
		
		assertTrue("Recherche du mot maman dans le dictionnaire", dico.isWord("maman"));
		assertFalse("Recherche du mot naman dans le dictionnaire", dico.isWord("naman"));
		
	}
}
