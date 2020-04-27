package accionesTest;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import dto.Customer;


public class AccionesTest {
	Gson gson = new Gson();
	Customer customer,customerEsperado = null;
	final String ESPERADO = "{\r\n" + 
			"		\"name\":\"Jose\",\r\n" + 
			" 		\"age\":\"26\",\r\n" + 
			"		\"birthDate\":\"10/03/1994\",\r\n" + 
			"            	\"country\":\"madrid\"\r\n" + 
			"	}";
	
	final String archivoJson = "src/main/archivos/entrada/ejemplo.json";
	

	
	
	 
	@Test
	public void testVacio() {
		try {
			customer = gson.fromJson(new FileReader(archivoJson), Customer.class);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertNotNull(customer);
	}
	
	@Test
	public void testContenidoJson() {
		try {

			customer = gson.fromJson(new FileReader(archivoJson), Customer.class);
			customerEsperado = gson.fromJson(ESPERADO, Customer.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals(customer.toString(), customerEsperado.toString());
	}
	

}
