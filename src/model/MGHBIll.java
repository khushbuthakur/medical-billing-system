package model;

import api.MedicalProcedureAPI;

public class MGHBIll implements MedicalProcedureAPI {

	private static final String HOSPITAL_CODE ="BIRHMIGHAM";
	private static final double BASE_BILL_COST = 155.49;
	private static final String BASE_BILL_DESCRIPTION = "Regular checkup";
	
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return this.HOSPITAL_CODE;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.BASE_BILL_DESCRIPTION;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.BASE_BILL_COST;
	}

	

}
