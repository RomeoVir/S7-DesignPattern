package esercizio.giovedi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rilevamento.CentroControllo;
import rilevamento.Sonda;

public class AppTest {
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
	
	@Test
	public void aggiungiSonda() {
		Sonda s1 = new Sonda(1, "12345","54321");
		boolean valoreAspettato = true;
		assertEquals(valoreAspettato, s1 != null);
		
	}
	
	@Test
	public void aggiungiOsservatore() {
		CentroControllo Milano = new CentroControllo();
		boolean valoreAspettato = true;
		assertEquals(valoreAspettato, Milano != null);
	}
	
//	@Test
//	public void sondaFuoriRange() {
//		Sonda s1 = new Sonda(1, "12345","54321");
//		boolean valoreAspettato = true;
//		assertEquals(valoreAspettato, Milano != null);
//	}
}
