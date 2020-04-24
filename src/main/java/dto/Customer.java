package dto;
import java.io.Serializable;

public class Customer implements Serializable{
	
	
	public Customer(String name, String age, String birthDate, String country) {
		this.name = name;
		this.age = age;
		this.birthDate = birthDate;
		this.country = country;
	}

	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String birthDate;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", country=" + country + "]";
	}
	
	
	
}
