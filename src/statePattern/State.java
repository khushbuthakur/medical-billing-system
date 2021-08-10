package statePattern;

import java.io.Serializable;

import model.Person;

public interface State extends Serializable {

	enum role {
		ADMIN, PATIENT
	};

	void createBill(Person p);

	void viewBills();

	void viewBillOfAPatitent(Person p);

	String sendBills();

	String sendBills(Person p);
}
