package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestASumar {

	/**
	 * Si el resultado es = 7 sera válida
	 */
	
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar ("7");
		String resultado = sumi.mostrar();
		assertEquals("7=7", resultado);
	}

	private void assertEquals(String string, String resultado) {
		// TODO Auto-generated method stub
		
	}
}
