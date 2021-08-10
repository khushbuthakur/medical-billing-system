package data.api;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class ReadFile implements Serializable {

	String fileName;

	public ReadFile(String fileName) {
		this.fileName = fileName;
	}

	@SuppressWarnings("unchecked")
	public List<Person> readFromDataFile() {
		List<Person> myList = new ArrayList<Person>();
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));

			myList = (List<Person>) is.readObject();
			is.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return myList;

	}
}
