package telran.person.service;

import telran.person.domain.Address;
import telran.person.domain.Person;
import telran.person.dto.AddressDto;

public interface IPerson {
	
	void addPerson(Person person);
	
	void addPersons(Iterable<Person> persons);
	
	Person getPerson(int id);
	
	boolean updateAddress(int id, AddressDto address);
	
	boolean removePerson(int id);
	
	Iterable<Person> getAllPersons();
	
	Iterable<Person> getPersonByAge(int minAge, int maxAge);
	
	Iterable<Person> getPersonByCity(String city);
	
	Iterable<Person> getEmployeeBySalary(int fromSalary, int toSalary);

}
