/*
 * Le main
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
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
