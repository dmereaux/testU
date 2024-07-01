package com.presta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



class TestFrais {

	@Test
	void test_nouveau_client() {
		frais f = new frais();
		assertEquals(0.0,f.calcul(true,"relais",600.0), "Erreur de calcul?");
	}
	@Test
	void test_ancien_client() {
		frais f = new frais();
		assertEquals(5.0,f.calcul(false,"relais",100.0), "Erreur de calcul?");
	}
	@Test
	void test_ancien_clientLimit() {
		frais f = new frais();
		assertEquals(0.0,f.calcul(false,"relais",300.0), "Erreur de calcul?");
	}

//	@Test
	void test_montant_sup500() {
		frais f = new frais();
		assertEquals(0.0,f.calcul(false,"relais",1000.0), "Erreur de calcul?");
	}
//	@Test
	void test_montant_INF300() {
		frais f = new frais();
		assertEquals(10.0,f.calcul(false,"COLISSIMO",100.0), "Erreur de calcul?");
	}
//	@Test
	void test_montant_Limit() {
		frais f = new frais();
		assertEquals(10.0,f.calcul(false,"COLISSIMO",299.99), "Erreur de calcul?");
	}


}
