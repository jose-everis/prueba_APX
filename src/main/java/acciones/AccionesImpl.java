package acciones;

import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;

import dto.Customer;

public class AccionesImpl extends Acciones{

	@Override
	public void leerJson(String archivoJson) {
		Gson gson = new Gson();
		Customer customer = null;

		try {

			customer = gson.fromJson(new FileReader(archivoJson), Customer.class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    System.out.println(customer);
		
		
	}

	@Override
	public void escribirJson(Customer customer) {
		
		
	}

	
	

}
