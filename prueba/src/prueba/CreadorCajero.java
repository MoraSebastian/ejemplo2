package prueba;

public class CreadorCajero {
	public static void main(String[] args) {
			GestionInformacion datos = new GestionInformacion();
			
			String nombreCajero; 
			int cantidadPersonasEnFila;		
			Cajero cajeroUno=null;  
			Cajero cajeroDos=null;
			Cajero cajeroTres=null;
			Cajero cajeroCuatro=null;		
			datos.muestraTexto("Escriba el nombre del cajero numero 1:");
			nombreCajero = datos.leerString();
			cajeroUno = Cajero.getCajero(nombreCajero);
			datos.muestraTexto("Escriba el nombre del cajero numero 2:");
			nombreCajero = datos.leerString();
			cajeroDos = Cajero.getCajero(nombreCajero);
			datos.muestraTexto("Escriba el nombre del cajero numero 3:");
			nombreCajero = datos.leerString();
			cajeroTres = Cajero.getCajero(nombreCajero);
			cajeroCuatro = Cajero.getCajero("Prueba");		
			datos.muestraTexto("Cajero 1:" +cajeroUno.getCajeroNombre()); 
			datos.muestraTexto("Cajero 2:" +cajeroDos.getCajeroNombre());
			datos.muestraTexto("Cajero 3:" +cajeroTres.getCajeroNombre());
			datos.muestraTexto("Cajero Prueba:"+cajeroCuatro.getCajeroNombre());		
			datos.muestraTexto("Escriba la cantidad de personas que se encuentran en la fila");
			cantidadPersonasEnFila=datos.leerInt();		
			for (int i=1; i<=(cantidadPersonasEnFila) ; i=i+3  ){
				if(i<=cantidadPersonasEnFila){
					cajeroUno.personasEnCajero.add(i);
				}
				if((i+1)<=cantidadPersonasEnFila){
					cajeroDos.personasEnCajero.add(i+1);
				}
				if((i+2)<=cantidadPersonasEnFila){
					cajeroTres.personasEnCajero.add(i+2);
				}}
			
			datos.muestraTexto("Personas que entrarán al "+ cajeroUno.getCajeroNombre()+ ": " + cajeroUno.muestraPersonas());
			datos.muestraTexto("Personas que entrarán al "+ cajeroDos.getCajeroNombre()+ ": " + cajeroDos.muestraPersonas());
			datos.muestraTexto("Personas que entrarán al "+ cajeroTres.getCajeroNombre()+ ": " + cajeroTres.muestraPersonas());
		}
	}

