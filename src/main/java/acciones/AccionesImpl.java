package acciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import dto.Customer;

public class AccionesImpl extends Acciones{

	@Override
	public void leerJson(String archivoJson) {
		Gson gson = new Gson();
		String fichero = "";
		 
		try (
			BufferedReader br = new BufferedReader(new FileReader(archivoJson))) {
		    String linea;
		    while ((linea = br.readLine()) != null) {
		    	fichero += linea;
		    }
		 
		} catch (FileNotFoundException ex) {
		    System.out.println(ex.getMessage());
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}
		Customer[] customers = gson.fromJson(fichero, Customer[].class);

		for (Customer custormer : customers) {
		    System.out.println(custormer);
		}
		
	}

	@Override
	public void escribirJson(Customer customer) {
		
		
	}

	
	

}
