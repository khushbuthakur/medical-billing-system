package api;

public class MedicalProcedureDecoratorAPI implements MedicalProcedureAPI {
	
	private MedicalProcedureAPI procedure;
	
	public MedicalProcedureDecoratorAPI(MedicalProcedureAPI procedure) {
		this.procedure = procedure;
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return this.procedure.getCode();
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.procedure.getDesc();
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return this.procedure.getCost();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("\nBill code: ").append(getCode()).append("\n");
		sb.append("Bill Description: ").append(getDesc()).append("\n");
		sb.append("Bill Cost: ").append(getCost()).append("\n");
		
		return sb.toString();
	}

}
