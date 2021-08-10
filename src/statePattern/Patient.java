package statePattern;

import java.util.List;

import facade.DataFacade;
import model.Person;

public class Patient implements State {

	DataFacade facade;

	public Patient() {
		facade = new DataFacade();
	}

	@Override
	public void createBill(Person p) {
		System.out.println("You cannot create bills!");
	}

	@Override
	public void viewBills() {
		System.out.println("You cannot view records");
	}

	@Override
	public void viewBillOfAPatitent(Person p) {
		facade.printContentOfSinglePerson(p);

	}

}
