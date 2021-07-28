package it.epicode.be.es1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CarrelloTest {

	@Test
	public void carrelloAppenaCreato() {

		ShoppingCart c1 = new ShoppingCart();
		int valoreAspettato = 0;
		assertEquals(valoreAspettato, c1.getItemCount());
	}

	@Test
	public void carrelloVuoto() {

		ShoppingCart c1 = new ShoppingCart();
		Product p1 = new Product("Drone", 5000);
		Product p2 = new Product("Batteria", 100);
		c1.addItem(p1);
		c1.addItem(p2);
		c1.empty();
		int valoreAspettato = 0;
		assertEquals(valoreAspettato, c1.getItemCount());
	}

	@Test
	public void carrelloAggiuntaProdotto() {

		ShoppingCart c1 = new ShoppingCart();
		Product p1 = new Product("Drone", 5000);
		Product p2 = new Product("Batteria", 100);
		c1.addItem(p1);
		c1.addItem(p2);
		int temporaneo = c1.getItemCount();

		Product p3 = new Product("Custodia", 25);
		Product p4 = new Product("Batteria", 100);

		c1.addItem(p3);
		c1.addItem(p4);

		assertEquals(temporaneo + 2, c1.getItemCount());
	}

	// - Quando viene aggiunto un nuovo prodotto, il totale (balance) deve essere la
	// somma del totale precedente più il costo del nuovo prodotto
	@Test
	public void carrelloAggiuntaProdottoBalance() {

		ShoppingCart c1 = new ShoppingCart();
		Product p1 = new Product("Drone", 5000);
		Product p2 = new Product("Batteria", 100);
		c1.addItem(p1);
		c1.addItem(p2);

		double totaleTemporaneo = c1.getBalance();

		Product p3 = new Product("Custodia", 25);
		c1.addItem(p3);

		double valoreAspettato = totaleTemporaneo + p3.getPrice();
		assertEquals(valoreAspettato, c1.getBalance(), 0.1);
	}

	// - Quando viene rimosso un prodotto, il numero di elementi viene decrementato
	@Test
	public void carrelloDecrementoProdotto() {

		ShoppingCart c1 = new ShoppingCart();
		Product p1 = new Product("Drone", 5000);
		Product p2 = new Product("Batteria", 100);
		c1.addItem(p1);
		c1.addItem(p2);
		int temporaneo = c1.getItemCount();

		try {
			c1.removeItem(p1);
		} catch (ProductNotFoundException e) {
		}

		assertEquals(temporaneo - 1, c1.getItemCount());
	}

	// - Quando si prova a rimuovere un prodotto non in carrello, deve essere
	// sollevata una eccezione ProductNotFoundException
	@Test(expected = ProductNotFoundException.class)
	public void carrelloDecrementoProdottoAssente() throws ProductNotFoundException {

		ShoppingCart c1 = new ShoppingCart();
		Product p1 = new Product("Drone", 5000);
		Product p2 = new Product("Batteria", 100);
		c1.addItem(p1);
		
		c1.removeItem(p2);

	}

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
}