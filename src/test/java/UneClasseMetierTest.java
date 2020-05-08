import org.junit.Test;

public class UneClasseMetierTest {

	@Test
	public void test() {
		UneClasseMetier metier3 = new UneClasseMetier(new Display2());
		metier3.executer();
	}
}
