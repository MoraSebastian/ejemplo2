package prueba;

import java.util.Scanner;

public class GestionInformacion {
	private Scanner lectura = new Scanner (System.in);
	public String leerString(){
	String string = lectura.nextLine();
	return string;
	}
	public int leerInt(){
	int numeroInt = lectura.nextInt();
	return numeroInt;
	}
	public void muestraTexto(String texto){
	System.out.println(texto);
	}
}
