package excel.errors.model;

import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.util.CellRangeAddressList;

public class DataValidationHelperError implements DataValidationHelper {

	
	public DataValidationConstraint createCustomConstraint(String arg0) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createDateConstraint(int arg0, String arg1,
			String arg2, String arg3) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createDecimalConstraint(int arg0,
			String arg1, String arg2) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createExplicitListConstraint(String[] arg0) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createFormulaListConstraint(String arg0) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createIntegerConstraint(int arg0,
			String arg1, String arg2) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createNumericConstraint(int arg0, int arg1,
			String arg2, String arg3) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createTextLengthConstraint(int arg0,
			String arg1, String arg2) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidationConstraint createTimeConstraint(int arg0, String arg1,
			String arg2) {
		
		return new DataValidationConstraintError();
	}

	
	public DataValidation createValidation(DataValidationConstraint arg0,
			CellRangeAddressList arg1) {
		
		return new DataValidationError();
	}

}
