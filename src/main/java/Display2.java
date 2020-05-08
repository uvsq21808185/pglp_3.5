/*
 * Une classe de bas niveau Display2.
 * Cette classe implémente d'une autre façon la méthode d'affichage de la classe abstraite Affichage.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public class Display2 extends Affichage {
	
	/*
	 * une deuxième implémentation de la méthode affichage par une classe de bas niveau Display2.
	 */
	public void afficher(String chaine) {
		
		System.out.println("*********\n") ; 
		System.out.println(chaine ) ; 
		System.out.println("\n *********") ; 
	}

}
