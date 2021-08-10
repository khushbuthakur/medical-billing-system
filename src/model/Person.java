package model;

import java.io.Serializable;
import java.util.List;

import api.MedicalProcedureAPI;
import api.ParameterizedDecorator;
import components.MRI;
import components.Xray;
import facade.DataFacade;
import items.Toothpaste;
import items.Tylenol;
import statePattern.Admin;
import statePattern.Patient;
import statePattern.State;
import command.UDPRecv;

public class Person implements Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private State role;
	/**
	 * Medical Bill object
	 */
	private MedicalProcedureAPI medicalBill;

	public Person() {
		super();
	}

	/**
	 * (TO BE COMPLETED BY STUDENT)
	 */

	/**
	 * return a String representation of the object state
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("# ").append(id);
		sb.append(" ").append(firstName);
		sb.append(" ").append(lastName);
		sb.append(", my bill ").append(medicalBill);

		return sb.toString();
	}

	/**
	 * Getters and Setters
	 */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public MedicalProcedureAPI getMedicalBill() {
		return medicalBill;
	}

	public void setMedicalBill(MedicalProcedureAPI medicalBill) {
		this.medicalBill = medicalBill;
	}

	public void setRole(State.role r) {
		switch (r) {
		case ADMIN:
			Admin admin = new Admin();
			this.role = admin;
			break;
		case PATIENT:
			Patient patient = new Patient();
			this.role = patient;
			break;
		}
	}

	public State getRole() {
		return role;
	}

	public void setRole(State role) {
		this.role = role;
	}

	public void createBill(Person p) {
		this.role.createBill(p);
	}

	public void viewBill() {
		this.role.viewBills();
	}

	public void viewBillOfSinglePatient(Person p) {
		this.role.viewBillOfAPatitent(p);
	}
	
	public String viewPatientBill(Person p) {
		return this.role.sendBills(p);
	}
	
	public String viewAllPatientBill() {
		return this.role.sendBills();
	}

	/**
	 * demonstrate the use of this class
	 */
	public static void demo() {
		System.out.println("\n\t" + Person.class.getName() + ".demo()...");
		// DataFacade facade = new DataFacade();

		Person admin = new Person();
		admin.setFirstName("admin");
		admin.setLastName("admin");
		admin.setId(0);
		admin.setRole(State.role.ADMIN);

		Person dan = new Person();
		dan.setFirstName("Daniel");
		dan.setLastName("Peters");
		dan.setId(1);
		dan.setRole(State.role.PATIENT);

		/**
		 * My MGH hospitalization and resulting Billing statement which include medical
		 * expenses for XRAY and MRI
		 * 
		 * (TO BE COMPLETED BY STUDENT)
		 */

		dan.setMedicalBill(new MRI(new Xray(new MGHBIll())));

		/**
		 * show all patient information with billing statement
		 */
		// System.out.println(dan);

		/**
		 * My MGH billing statement updated with added miscellaneous expenses from
		 * Legacy Objects which include miscellaneous expenses from Toothpaste and
		 * Tylenol
		 * 
		 * (TO BE COMPLETED BY STUDENT)
		 */

		/**
		 * Adding tylenol to the medical bill
		 * 
		 * 
		 * DECORATOR USING PROTOTYPE PATTERN
		 */

		MedicalProcedureAPI legacyBill = new ParameterizedDecorator(new Tylenol(), dan.getMedicalBill());
		dan.setMedicalBill(legacyBill);

		/**
		 * Adding the toothpaste to the medical bill
		 * 
		 * DECORATOR USING PROTOTYPE PATTERN
		 */
		legacyBill = new ParameterizedDecorator(new Toothpaste(), dan.getMedicalBill());
		dan.setMedicalBill(legacyBill);
		/**
		 * show all patient information with billing statement
		 */

		// System.out.println(dan);

		/**
		 * Facade method saves the data in file
		 */
		// facade.saveData(dan);

		Person patient = new Person();
		patient.setFirstName("Khushbu");
		patient.setLastName("Thakur");
		patient.setId(2);
		patient.setRole(State.role.PATIENT);

		patient.setMedicalBill(new Xray(new MGHBIll()));

		MedicalProcedureAPI legacyBill2 = new ParameterizedDecorator(new Toothpaste(), patient.getMedicalBill());
		patient.setMedicalBill(legacyBill2);

//	        facade.saveData(patient);

//	        List<Person> p = facade.readData();

//	        facade.printData(p);

		/**
		 * AUTHORIZATION CHECK for patient
		 */

		admin.createBill(dan);
		admin.createBill(patient);
		admin.viewBill();

		patient.createBill(patient);

		dan.viewBillOfSinglePatient(dan);
		patient.viewBill();
		
		UDPRecv.demo(patient.viewPatientBill(patient));

		System.out.println("\n\t" + Person.class.getName() + ".demo()... done!");
	}
}
