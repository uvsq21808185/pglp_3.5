import java.time.LocalDateTime;
/*
 * La classe de haut niveau.
 * 
 * @author ZAOUAM Sirageddine
 * @version 2.0
 */
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
