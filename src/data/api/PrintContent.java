package data.api;

import java.io.Serializable;
import java.util.List;

import model.Person;

public class PrintContent implements Serializable {

	public void printContent(List<Person> persons) {

		for (Person p : persons) {
			System.out.println("------------- Data from File ----------------");
			System.out.println("Patient First Name: " + p.getFirstName());
			System.out.println("Patient Last Name: " + p.getLastName());
			System.out.println("Patient ID: " + p.getId());
			System.out.println("-------------Medical Bill Details-------------");
			System.out.println("Bill Code: " + p.getMedicalBill().getCode());
			System.out.println("Bill Description: " + p.getMedicalBill().getDesc());
			System.out.println("Bill Cost: " + p.getMedicalBill().getCost());
		}
	}

	public String sendContent(List<Person> persons) {
		StringBuilder sb = new StringBuilder();

		for (Person p : persons) {
			sb.append("\n\n*************** Data from Bin File ********************");
			sb.append("\nPatient First Name: " + p.getFirstName());
			sb.append("\nPatient Last Name: " + p.getLastName());
			sb.append("\nPatient ID: " + p.getId());
			sb.append("\n========== Medical Bill Details ==========");
			sb.append("\nBill Code: " + p.getMedicalBill().getCode());
			sb.append("\nBill Description: " + p.getMedicalBill().getDesc());
			sb.append("\nBill Cost: " + p.getMedicalBill().getCost());
		}

		return sb.toString();
	}

	public String sendContent(Person p) {
		StringBuilder sb = new StringBuilder();

		sb.append("\n*************** Data from Bin File ********************");
		sb.append("\nPatient First Name: " + p.getFirstName());
		sb.append("\nPatient Last Name: " + p.getLastName());
		sb.append("\nPatient ID: " + p.getId());
		sb.append("\n========== Medical Bill Details ==========");
		sb.append("\nBill Code: " + p.getMedicalBill().getCode());
		sb.append("\nBill Description: " + p.getMedicalBill().getDesc());
		sb.append("\nBill Cost: " + p.getMedicalBill().getCost());

		return sb.toString();
	}

	public void printContentOfSinglePatient(Person p) {
		System.out.println("Single Patient details");
		System.out.println("----------------------------------------------------");
		System.out.println("Patient First Name: " + p.getFirstName());
		System.out.println("Patient Last Name: " + p.getLastName());
		System.out.println("Patient ID: " + p.getId());
		System.out.println("------------- Medical Bill Details -------------");
		System.out.println("Bill Code: " + p.getMedicalBill().getCode());
		System.out.println("Bill Description: " + p.getMedicalBill().getDesc());
		System.out.println("Bill Cost: " + p.getMedicalBill().getCost());
	}

}
