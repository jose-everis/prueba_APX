package acciones;

import com.google.gson.Gson;

import dto.Customer;

public class AccionesImpl extends Acciones{

	@Override
	public void leerJson(String archivoJson) {
		Gson gson = new Gson();
		Customer[] customers = gson.fromJson(archivoJson, Customer[].class);

		for (Customer custormer : customers) {
		    System.out.println(custormer);
		}
		
	}

	@Override
	public void escribirJson(Customer customer) {
		
		
	}

	
	

}
