package fr.esiea.binome.Mehrenberger_Sidoli.app;

//import java.util.Arrays;
//import java.util.List;
//import fr.esiea.unique.binome.name.bag.SmartBag;
import fr.esiea.binome.Mehrenberger_Sidoli.lettergameengine.LetterGameEngine;


public class App{
	public static void main( String[] args )
	{
		LetterGameEngine letterGameEngine = new LetterGameEngine();
		letterGameEngine.initialisationGame();
		letterGameEngine.run();
	}	
}
