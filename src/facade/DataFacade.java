package facade;

import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;

import data.api.PrintContent;
import data.api.ReadFile;
import data.api.WriteFile;
import model.Person;

public class DataFacade implements Serializable {

	String fileName = "data.bin";
	WriteFile writeFile;
	ReadFile readFile;
	PrintContent print;

	public DataFacade() {
		writeFile = new WriteFile(fileName);
		readFile = new ReadFile(fileName);
		print = new PrintContent();
	}

	public void saveData(Person person) {
		/*
		 * Use the method of WriteFile class to write the data
		 */

		writeFile.writeDataIntoFile(person);
	}

	public void printData(List<Person> p) {
		print.printContent(p);
	}
	
	public String sendData(List<Person> p) {
		return print.sendContent(p);
	}
	
	public String sendData(Person p) {
		return print.sendContent(p);
	}

	public void printContentOfSinglePerson(Person p) {
		print.printContentOfSinglePatient(p);
	}

	public List<Person> readData() {
		return readFile.readFromDataFile();
	}
	
	public Person verifyUser(String firstName, String lastName) {
		Person p = null;
		
		List<Person> persons = readData();
		
		for(Person per : persons) {
			if(per.getFirstName().equals(firstName) && per.getLastName().equals(lastName)) {
				return per;
			}
		}
		
		return p;
	}
}
