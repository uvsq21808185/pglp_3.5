/*
 * Une abstraction pour simplifier la liaison entre les deux niveaux.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
public abstract class Affichage {
	
	/*
	 * Méthode d'affichage qui sera implémenter par les modules de bas niveau
	 * et utiliser dans la classe de haut niveau " la calsse métier". 
	 */
	abstract void afficher(String chaine) ; 

}
