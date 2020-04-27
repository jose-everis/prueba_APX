package ejecutar;

import acciones.AccionesImpl;

public class EjecutarJson {
	
	public final static String PATH = "src/main/archivos/entrada/";
	public static String archivoJson = PATH + "ejemplo.json";
			
	
	public static void main(String[] args) {
		AccionesImpl accion = new AccionesImpl();
		accion.leerJson(archivoJson);
	}
}
