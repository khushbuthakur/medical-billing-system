package api;

import java.io.Serializable;

/**
 *
 * @author khushbu
 *
 */

public class ParameterizedDecorator implements MedicalProcedureAPI, Cloneable {

	ItemAPI protoype;
	MedicalProcedureAPI legacyBill;
	String code;
	String description;
	double cost;

	public ParameterizedDecorator(ItemAPI prototype, MedicalProcedureAPI obj) {
		this.protoype = prototype;
		this.legacyBill = obj;
		this.code = Integer.toString(protoype.getId());
		this.description = protoype.getDescription();
		this.cost = protoype.getPrice();
	}

	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return legacyBill.getCode() + "_" + code;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return legacyBill.getDesc() + " - " + description;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return legacyBill.getCost() + cost;
	}

	public ItemAPI clone() {
		Object clone = null;

		try {
			clone = super.clone();
		} catch (CloneNotSupportedException cloneException) {
			cloneException.printStackTrace();
		}

		return (ItemAPI) clone;

	}

	public ItemAPI getProtoype() {
		return protoype;
	}

	public void setProtoype(ItemAPI protoype) {
		this.protoype = protoype;
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
