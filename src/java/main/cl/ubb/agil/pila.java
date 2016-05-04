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
	
	public void agregarNumero(int numero){
			posicion++;
			arreglo[posicion]=numero;
	}
	
	public int tamano(){
		return posicion+1;
	}
	
	public int pop(){
		
		return arreglo[posicion--];
	}

}
