package cl.ubb.agil;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class PilaTest {

	@Test
	public void NuevoStackVacio() {
		Pila pila= new Pila();
		boolean resultado = pila.estaVacio();
		assertThat(resultado,is(true));
	}

}
