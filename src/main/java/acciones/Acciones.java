package acciones;

import dto.Customer;

public abstract class Acciones {
	protected abstract void leerJson(String archivoJson);
	
	protected abstract void escribirJson(Customer customer);
	
}
