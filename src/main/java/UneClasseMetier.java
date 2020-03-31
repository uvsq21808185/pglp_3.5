import java.time.LocalDateTime;

public class UneClasseMetier {
	
	
	private Affichage a;

	public UneClasseMetier(Affichage aff) {
		this.a = aff;
	}
	
	public void executer() {
		a.afficher(LocalDateTime.now() + " : Début  de  uneMethodeMetier ");
		a.afficher(LocalDateTime.now() + " :  Fin  de  uneMethodeMetier ");
	}

}
