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
	
	public void AgregarUnoYDosStackNoVacio(){
		Pila pila= new Pila();
		pila.agregarNumero(1);
		pila.agregarNumero(2);
		boolean resultado = pila.estaVacio();
		assertThat(resultado,is(false));
	}
	@Test
	public void AgregarUnoYDosTamanoStackEsDos(){
		Pila pila= new Pila();
		pila.agregarNumero(1);
		pila.agregarNumero(2);
		int resultado = pila.tamano();
		assertThat(resultado,is(2));
	}
	@Test
	public void AgregarUnoYPopEsUno() throws Exception{
		Pila pila= new Pila();
		pila.agregarNumero(1);
		int resultado = pila.pop();
		assertThat(resultado,is(1));
	}
	
	@Test
	public void AgregarUnoYDosYPopEsDos() throws Exception{
		Pila pila= new Pila();
		pila.agregarNumero(1);
		pila.agregarNumero(2);
		int resultado = pila.pop();
		assertThat(resultado,is(2));
	}
	@Test
	public void AgregarTresYCuatroYPopDosVecesEsCuatroYTres() throws Exception{
		Pila pila= new Pila();
		pila.agregarNumero(3);
		pila.agregarNumero(4);
		String resultado="";
		resultado+= pila.pop();
		resultado+= pila.pop();
		assertThat(resultado,is("43"));
	}
	@Test (expected=Exception.class)
	public void popAStackVacioError() throws Exception{
		Pila pila= new Pila();
		int resultado = pila.pop();
		
	}
	
	

}
