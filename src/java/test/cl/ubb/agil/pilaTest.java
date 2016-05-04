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
	
	
	@Test
	public void AgregarUnoStackNoVacio(){
		Pila pila= new Pila();
		pila.agregarNumero(1);
		boolean resultado = pila.estaVacio();
		assertThat(resultado,is(false));
	}
	
	
	
	

}
