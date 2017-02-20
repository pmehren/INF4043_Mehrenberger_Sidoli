package fr.esiea.binome.Mehrenberger_Sidoli.dictionaire;

import org.junit.Before;
import org.junit.Test;

import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.Dictionaire;
import fr.esiea.binome.Mehrenberger_Sidoli.dictionaire.IDictionaire;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaireTest {

    private IDictionaire dictionaire;

	@Before
	public void setup(){	
		this.dictionaire = new Dictionaire();	
	}
    
    @Test
    public void IsWordTest() { //Test si le mot est dans le dictionnaire dico.txt
      assertTrue(dictionaire.isWord("maman"));
      assertFalse(dictionaire.isWord("namam"));
      assertTrue(dictionaire.isWord("bébé"));
      assertTrue(dictionaire.isWord("deux-deux"));
      
    }
}
