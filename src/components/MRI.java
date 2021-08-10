package components;

import api.MedicalProcedureAPI;
import api.MedicalProcedureDecoratorAPI;

public class MRI extends MedicalProcedureDecoratorAPI{

	public MRI(MedicalProcedureAPI procedure) {
		super(procedure);
		// TODO Auto-generated constructor stub
	}
	
	private static final String code = "MRI";
	private static final String description = "Magenetic Resonance Imaging";
	private static final double cost = 1099.00;
	
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
