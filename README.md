# pglp_3.5 Illustration du principe d’inversion des dépendances (DIP)

1. Ce code ne repsecte pas le principe DIP car: La classe UneClasseMetier (qui a un comportement particulier) qui est un détail ne doit pas déprendre des traitements métiers liés.

2. Proposons une solution respectant DIP :

On crée la classe abstraite Affichage et son role c'est juste d'afficher :

public abstract class Affichage {
	
	  abstract void afficher(String chaine) ; 
}

Cette méthode d'affichage sera implémenter par les modules de bas niveau Display1 et Display2
et utiliser dans la classe de haut niveau " la calsse métier". 

- On crée maintenant les deux classes de bas niveau : Display1 et Display2 qui implémente la classe abstraite Affichage :

public class Display1 extends Affichage {

	
	public void afficher(String chaine) {
		// TODO Auto-generated method stub
		System.out.println(chaine +"\n") ; 
	}
}

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

- Finallement on implémente la classe de haut niveau la classe métier :

public class UneClasseMetier {
	
	/*
	 * L'affichage qu'on veut utiliser dans notre classe métier : Display1 ou Display2.
	 */
	private Affichage a;
	/*
	 * Le constructeur de la classe.
	 * @param aff la classe d'affichage display1 ou display2.
	 */
	public UneClasseMetier(Affichage aff) {
		this.a = aff;
	}
	/*
	 * Une méthode d'exécution.
	 */
	public void executer() {
		a.afficher(LocalDateTime.now() + " : Début d'uneMethodeMetier ");
		a.afficher(LocalDateTime.now() + " :  Fin  d'uneMethodeMetier ");
	}

}

-Main :

public class main {

	public main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DISPLAY 1 :") ; 
		/*
		 * Instaciation de la classe de haut niveau "uneClasseMetier" avec en paramètre 
		 * le choix d'une classe de bas niveau.
		 */
		UneClasseMetier metier1 = new UneClasseMetier(new Display1());
		metier1.executer();
		System.out.println("DISPLAY 2 :") ; 

		UneClasseMetier metier2 = new UneClasseMetier(new Display2());
		metier2.executer();

	}

}

