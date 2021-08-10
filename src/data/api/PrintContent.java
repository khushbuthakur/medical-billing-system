package data.api;

import java.io.Serializable;
import java.util.List;

import model.Person;

public class PrintContent implements Serializable {
	
	public void printContent(List<Person> persons) {
		
		for(Person p: persons) {
			  System.out.println("------------- Data from File ----------------");
		        System.out.println("Patient First Name: "+p.getFirstName());
		        System.out.println("Patient Last Name: "+p.getLastName());
		        System.out.println("Patient ID: "+p.getId());
		        System.out.println("-------------Medical Bill Details-------------");
		        System.out.println("Bill Code: "+p.getMedicalBill().getCode());
		        System.out.println("Bill Description: "+p.getMedicalBill().getDesc());
		        System.out.println("Bill Cost: "+p.getMedicalBill().getCost());
		} 
	}
	
	public void printContentOfSinglePatient(Person p) {
		System.out.println("Single Patient details");
		System.out.println("----------------------------------------------------");
		System.out.println("Patient First Name: "+p.getFirstName());
        System.out.println("Patient Last Name: "+p.getLastName());
        System.out.println("Patient ID: "+p.getId());
        System.out.println("------------- Medical Bill Details -------------");
        System.out.println("Bill Code: "+p.getMedicalBill().getCode());
        System.out.println("Bill Description: "+p.getMedicalBill().getDesc());
        System.out.println("Bill Cost: "+p.getMedicalBill().getCost());
	}

}
