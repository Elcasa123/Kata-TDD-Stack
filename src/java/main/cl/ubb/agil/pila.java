package cl.ubb.agil;

public class Pila {
	
	int [] arreglo;
	int posicion;
	
	
	public Pila(){
		arreglo= new int[20];
		posicion=-1;
	}
	
	public boolean estaVacio(){
		if(posicion==-1)
			return true;
		else
			return false;
	}

}
