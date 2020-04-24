package ejecutar;

import acciones.AccionesImpl;

public class EjecutarJson {
	
	public static String archivoJson = "[{\"name\":\"Jose\"," + "\"age\":\"26\","
            + "\"birthDate\":\"10/03/1994\","
            + "\"country\":\"madrid\"}]";
	
	
	public static void main(String[] args) {
		AccionesImpl accion = new AccionesImpl();
		accion.leerJson(archivoJson);
	}
}
