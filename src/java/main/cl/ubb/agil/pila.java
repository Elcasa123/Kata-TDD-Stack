package cl.ubb.agil;

public class Pila {
	
	int [] arreglo;
	int posicion;
	
	
	public Pila(){
		arreglo= new int[2];
		posicion=-1;
	}
	
	public boolean estaVacio(){
		if(posicion==-1)
			return true;
		else
			return false;
	}
	
	public void agregarNumero(int numero) throws Exception{
		if(arreglo.length-1==posicion)
			throw new Exception("");
		else{
			posicion++;
			arreglo[posicion]=numero;
		}
			
	}
	
	public int tamano(){
		return posicion+1;
	}
	
	public int pop() throws Exception{
		if(estaVacio())
			throw new Exception("Error stack Vacio");
		else
			return arreglo[posicion--];
	}
	public int top(){
		return arreglo[posicion];//codigo solo para probar prueba, no cumple con la funcion completa de pila
	}

}
