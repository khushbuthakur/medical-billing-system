package components;

import api.MedicalProcedureAPI;
import api.MedicalProcedureDecoratorAPI;
import model.Person;

public class Xray extends MedicalProcedureDecoratorAPI{

	public Xray(MedicalProcedureAPI procedure) {
		super(procedure);
		// TODO Auto-generated constructor stub
	}
	
	private static final String code = "XRAY";
	private static final String description = "Painless test which produces images of structures in body, especially bones using high energy electromagnetic waves.";
	private static final double cost = 154.00;
	
	@Override
	public String getCode() {
		return super.getCode() + code;
	}
	
	@Override
	public String getDesc() {
		return super.getDesc() + description;
	}
	
	public double getCost() {
		return super.getCost() + cost;
	}
}
