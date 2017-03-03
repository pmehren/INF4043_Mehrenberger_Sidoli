package fr.esiea.binome.Mehrenberger_Sidoli.potcommun;

public class TabMotsCache {
	public static String superTab[] = new String [20];
	public String mot;
		
////////////////VOL DES MOTS A FAIRE//////////////////////////
//Création d'un tableau de mots caché (tout les mots validés) maximum 19mots
//Afin d'avoir une archive pour autoriser si vol de lettres
	public static void RemplirSuperTab(String mot) { 

		int i;
		int flag =0;
			try {
				for(i=0; i < superTab.length; i++) {
					if(superTab[i] == null && flag == 0) {
						superTab[i] = mot;
						flag = 1;	
					}
				}
			}
			catch (Exception e) {
				System.out.println(e.toString());
			}	
	}
	
	public static int AutorisationDuMot(String word) { //Vérifie si le mot a déjà été utilisé (flag = 1 ->Oui)
		
		boolean bool;
		int flag=0;
			try {
				for(int i=0;i<superTab.length;i++) {	
					if(superTab[i] != null ) {
						bool = word.contains(superTab[i]);
						if(bool == true) {
								flag=1;
								break;
						}
					}
				}
			}catch (Exception e) {
				System.out.println(e.toString());
			}	
		return flag;
	}
	
	public static void afficherLeTableauDeMot() {
		 		
		System.out.println("");
		System.out.println("Voici les mots trouvés que vous pouvez réutiliser:");
		System.out.println("");
		 	try {
		 		for(int i=0; i<superTab.length; i++) {
		 			if(superTab[i] == null) {
		 				System.out.print(", ");
		 			}
		 			else {
		 				System.out.print(superTab[i] +", ");
		 			}
		 		}
		 	}
		 	catch (Exception e) {
		 		System.out.println(e.toString());
		 	}	
	}
}


