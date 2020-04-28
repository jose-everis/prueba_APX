package accionesTest;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
	
	@Before
	public void iniciarDatos() {
		
		
		try {
			customer = gson.fromJson(new FileReader(archivoJson), Customer.class);
			customerEsperado = gson.fromJson(ESPERADO, Customer.class);
		} catch (JsonSyntaxException e) {
			fail("Error en la sintaxis del fichero json");
		} catch (JsonIOException e) {
			fail("Error al leer archivo");
		} catch (FileNotFoundException e) {
			fail("Fichero Json no encontrado");
		}
	}
	@Test
	public void testVacio() {
		
		Assert.assertNotNull(customer);
	}
	
	@Test
	public void testFormatoJson() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		
//		JsonParser parser = new JsonParser();
//		JsonObject jsonObject = parser.parse(new FileReader(archivoJson)).getAsJsonObject();
//		Customer customer = new Customer();
//		
//		customer.setName(jsonObject.get("name").getAsString());
//		customer.setAge(jsonObject.get("age").getAsString());
//		customer.setBirthDate(jsonObject.get("birthDate").getAsString());
//		customer.setCountry(jsonObject.get("country").getAsString());
		
		
		
		if((customer.getName() == null || customer.getName().isEmpty())||
			(customer.getAge() == null ||customer.getAge().isEmpty()) || 
			(customer.getBirthDate() == null ||customer.getBirthDate().isEmpty()) ||  
			(customer.getCountry() == null || customer.getCountry().isEmpty() )) {
			
			fail("El contenido del archivo Json no se corresponde con la clase Consumer");
		}
	}
	
	@Test
	public void testContenidoJson() {
		Assert.assertEquals(customer.toString(), customerEsperado.toString());
		
	}
	

}
