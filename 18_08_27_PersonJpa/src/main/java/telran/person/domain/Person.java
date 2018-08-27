package telran.person.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS)
public abstract class Person {
	
	@Id
	int id;
	String name;
	LocalDate birthdate;
	Address address;
	
	public Person(int id, String name, LocalDate birthdate, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
	}
	
	public Person() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public abstract String toString();
	
}
