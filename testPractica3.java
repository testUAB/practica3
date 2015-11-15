import static org.junit.Assert.*;

import org.junit.Test;


public class testPractica3 {

	@Test
	public void testColocarVaixell() {
		//fail("Not yet implemented");
		
		Tauler tauler = new Tauler(4, 4);
		Vaixell vaixell = new Vaixell(3, Orientacio.H);
		assertTrue(tauler.ColocarVaixell(0, 0, vaixell));
		assertFalse(tauler.ColocarVaixell(4, 0, vaixell));
		assertTrue(tauler.ColocarVaixell(2, 2, new Vaixell(2, Orientacio.V)));
		tauler.imprimirTauler();
		tauler.FerTotAigua();
		assertFalse(tauler.ColocarVaixell(3, 2, new Vaixell(2, Orientacio.V)));
		assertTrue(tauler.ColocarVaixell(1, 3, new Vaixell(3, Orientacio.V)));
		assertFalse(tauler.ColocarVaixell(2, 3, new Vaixell(2, Orientacio.H)));
		tauler.imprimirTauler();
		tauler.FerTotAigua();
		assertTrue(tauler.ColocarVaixell(1, 3, new Vaixell(3, Orientacio.V)));
		assertFalse(tauler.ColocarVaixell(1, 3, new Vaixell(3, Orientacio.V)));
		assertFalse(tauler.ColocarVaixell(0, 3, new Vaixell(3, Orientacio.V)));
		tauler.imprimirTauler();
	}

}
