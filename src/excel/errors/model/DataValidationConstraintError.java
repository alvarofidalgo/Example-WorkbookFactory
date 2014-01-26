package excel.errors.model;

import org.apache.poi.ss.usermodel.DataValidationConstraint;

public class DataValidationConstraintError implements DataValidationConstraint {

	
	public String[] getExplicitListValues() {
		String [] returnValue ={};
		return returnValue;
	}

	
	public String getFormula1() {
		
		return "";
	}

	
	public String getFormula2() {
		
		return "";
	}

	
	public int getOperator() {
		
		return 0;
	}

	
	public int getValidationType() {
		
		return 0;
	}

	
	public void setExplicitListValues(String[] arg0) {
		

	}

	
	public void setFormula1(String arg0) {
		

	}

	
	public void setFormula2(String arg0) {
		

	}

	
	public void setOperator(int arg0) {
		

	}

}
