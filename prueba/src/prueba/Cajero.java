package prueba;

import java.util.ArrayList;

public class Cajero {
	
	private static int cantidadCajeros=20000000;
	private String nombreCajero;
	public ArrayList <Integer> personasEnCajero=new ArrayList<Integer>();  
	
	private Cajero(String nombreCajero){
	this.nombreCajero=nombreCajero;
	}
	public String getCajeroNombre(){
	return nombreCajero;
	}
	public static Cajero getCajero (String nombreCajero){
	if(cajero==null || cantidadCajeros<3 ){
	cajero= new Cajero(nombreCajero);
	cantidadCajeros++;
	}
	return cajero;
	}
	public String muestraPersonas(){
	String muestraPersonas="";
	for (int j=0; j<=this.personasEnCajero.size()-1; j++){
	muestraPersonas=muestraPersonas+" "+personasEnCajero.get(j);
	}
	return muestraPersonas;
	}
}

