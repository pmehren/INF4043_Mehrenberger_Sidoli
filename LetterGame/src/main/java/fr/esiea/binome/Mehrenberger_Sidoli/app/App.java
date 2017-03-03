package fr.esiea.binome.Mehrenberger_Sidoli.app;

//import java.util.Arrays;
//import java.util.List;
//import fr.esiea.unique.binome.name.bag.SmartBag;
import fr.esiea.binome.Mehrenberger_Sidoli.lettergameengine.LetterGameEngine;


public class App{
	public static void main( String[] args ){
	
		int choice=0;
		int flagdebut= 0;
		Scanner scan = null;
		while(flagdebut==0){
			try{
				System.out.println("Voici le jeu LETTERGAME !");
				System.out.println("Pour un J1 VS J2 =>taper 1");
				System.out.println("Pour un J1 VS IA =>taper 2 (not yet implanted)\n");
				scan = new Scanner(System.in);
				choice = scan.nextInt();
				
				if(choice==1){
					LetterGameEngine appLetterGame = new LetterGameEngine();
					flagdebut=1;
					appLetterGame.initialisationGame();
					appLetterGame.run();
				}
				else if(choice==2){
					IA appLetterGameIA = new IA();
					flagdebut=1;
					appLetterGameIA.initialisationGame();
					appLetterGameIA.run();
				}
			}
			catch(InputMismatchException e){
			System.out.println("Veuillez choisir entre 1(VsPlayer) ou 2(vsIA) ");
			}
		}
		scan.close();
	}
}
