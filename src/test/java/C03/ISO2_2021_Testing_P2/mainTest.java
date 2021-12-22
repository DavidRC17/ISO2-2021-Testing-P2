package C03.ISO2_2021_Testing_P2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class mainTest {

	@Test
	public void testPuedeViajar() {
		//COBERTURA DE DECISIONES
		Persona pers1 = new Persona(22, true, true, true, true, true);
		Pandemia pand1 = new Pandemia(50);
		main.calcularNivelPandemia(pand1, 95);
		assertEquals(false, main.puedeViajar(pers1, pand1, 95));
		
		Persona pers2 = new Persona(22, false, false, false, true, false);
		assertEquals(true, main.puedeViajar(pers2, pand1, 95));
		
		Persona pers3 = new Persona(22, false, false, false, false, false);
		main.calcularNivelPandemia(pand1, 95);
		assertEquals(true, main.puedeViajar(pers3, pand1, 95));
		
		Persona pers4 = new Persona(22, false, false, false, false, true);
		Pandemia pand2 = new Pandemia(250);
		main.calcularNivelPandemia(pand2, 95);
		assertEquals(true, main.puedeViajar(pers4, pand2, 95));
		
		Persona pers5 = new Persona(22, false, false, false, false, false);
		assertEquals(true, main.puedeViajar(pers5, pand2, 95));
		
		Persona pers6 = new Persona(22, false, false, false, false, true);
		Pandemia pand3 = new Pandemia(350);
		main.calcularNivelPandemia(pand3, 95);
		assertEquals(true, main.puedeViajar(pers6, pand3, 95));
		
		Persona pers7 = new Persona(22, false, false, false, false, false);
		assertEquals(true, main.puedeViajar(pers7, pand3, 95));
		
		Persona pers8 = new Persona(22, false, false, false, false, true);
		Pandemia pand4 = new Pandemia(550);
		main.calcularNivelPandemia(pand4, 95);
		assertEquals(true, main.puedeViajar(pers8, pand4, 95));
		
		Persona pers9 = new Persona(68, false, false, false, false, false);
		assertEquals(false, main.puedeViajar(pers9, pand4, 95));
		
	}

	@Test
	public void testCalcularPrecio() {
		Persona pers1 = new Persona(22, false, false, false, true, false);
		Persona pers2 = new Persona(68, false, false, false, true, false);

		Pandemia pand1 = new Pandemia(50);
		Pandemia pand2 = new Pandemia(150);
		Pandemia pand3 = new Pandemia(250);
		Pandemia pand4 = new Pandemia(350);
		Pandemia pand5 = new Pandemia(550);
		
		main.calcularNivelPandemia(pand1, 95);
		main.calcularNivelPandemia(pand2, 95);
		main.calcularNivelPandemia(pand3, 95);
		main.calcularNivelPandemia(pand4, 95);
		main.calcularNivelPandemia(pand5, 95);
		
		assertEquals(6, (int)main.calcularPrecio(10, pers1, pand1, 95));
		assertEquals(8, (int)main.calcularPrecio(10, pers2, pand1, 95));
		assertEquals(3, (int)main.calcularPrecio(10, pers1, pand2, 95));
		assertEquals(5, (int)main.calcularPrecio(10, pers2, pand2, 95));
		assertEquals(10, (int)main.calcularPrecio(10, pers1, pand3, 95));
		assertEquals(12, (int)main.calcularPrecio(10, pers2, pand3, 95));
		assertEquals(12, (int)main.calcularPrecio(10, pers1, pand4, 95));
		assertEquals(15, (int)main.calcularPrecio(10, pers2, pand4, 95));
		assertEquals(15, (int)main.calcularPrecio(10, pers1, pand5, 95));
	}

	@Test
	public void testCalcularNivelPandemia() {
		Pandemia pand1 = new Pandemia(50);
		Pandemia pand2 = new Pandemia(150);
		Pandemia pand3 = new Pandemia(250);
		Pandemia pand4 = new Pandemia(350);
		Pandemia pand5 = new Pandemia(550);
		
		assertEquals(0, main.calcularNivelPandemia(pand1, 95));
		assertEquals(1, main.calcularNivelPandemia(pand2, 95));
		assertEquals(2, main.calcularNivelPandemia(pand3, 95));
		assertEquals(3, main.calcularNivelPandemia(pand4, 95));
		assertEquals(4, main.calcularNivelPandemia(pand5, 95));
		
	}

}
