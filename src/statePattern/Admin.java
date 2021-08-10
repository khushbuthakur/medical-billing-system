package statePattern;

import java.util.List;

import facade.DataFacade;
import model.Person;

public class Admin implements State {

	DataFacade facade;

	public Admin() {
		facade = new DataFacade();
	}

	@Override
	public void createBill(Person p) {
		System.out.println("Congratulations! " + p.getFirstName() + " is in our system now!");
		facade.saveData(p);
	}

	@Override
	public void viewBills() {
		System.out.println("Admin view of patients");
		List<Person> myList = facade.readData();
		facade.printData(myList);
	}

	@Override
	public String sendBills() {
		List<Person> myList = facade.readData();
		return facade.sendData(myList);
	}

	@Override
	public String sendBills(Person p) {
		// TODO Auto-generated method stub
		return facade.sendData(p);
	}

	@Override
	public void viewBillOfAPatitent(Person p) {
		facade.printContentOfSinglePerson(p);
	}
}
