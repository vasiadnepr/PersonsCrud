package telran.person.domain;

public class Address {
	String city;
	String street;
	int building;
	
	public Address() {}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", building=" + building + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}

	public Address(String city, String street, int building) {
		super();
		this.city = city;
		this.street = street;
		this.building = building;
	}

}
