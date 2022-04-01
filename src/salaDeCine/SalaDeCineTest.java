package salaDeCine;

import static org.junit.Assert.*;

import org.junit.Test;

public class SalaDeCineTest {

	@Test
	public void test() {
		SalaDeCine Odeon = new SalaDeCine(50,5);
		assertFalse(Odeon.estaOcupada(0, 0));
		Odeon.ocuparButaca(2, 2);
		assertTrue(Odeon.estaOcupada(2, 2));
	}

}
