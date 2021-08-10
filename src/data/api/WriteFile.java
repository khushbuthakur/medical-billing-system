package data.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.Person;

public class WriteFile implements Serializable{
	
	String fileName;
	List<Person> myList = null;
	
	public WriteFile(String fileName) {
		
		this.fileName = fileName;
		myList = new ArrayList<Person>();
		
	}
	
	public void writeDataIntoFile(Person person) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			myList.add(person);
			os.writeObject(myList);
			os.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
