
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DISPLAY 1 :") ; 

		UneClasseMetier metier1 = new UneClasseMetier(new Display1());
		metier1.executer();
		System.out.println("DISPLAY 2 :") ; 

		UneClasseMetier metier2 = new UneClasseMetier(new Display2());
		metier2.executer();

	}

}
