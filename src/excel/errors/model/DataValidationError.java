package excel.errors.model;

import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;

public class DataValidationError implements DataValidation {

	
	public void createErrorBox(String arg0, String arg1) {
		
		
	}

	
	public void createPromptBox(String arg0, String arg1) {
		
		
	}

	
	public boolean getEmptyCellAllowed() {
		
		return false;
	}

	
	public String getErrorBoxText() {
		
		return "";
	}

	
	public String getErrorBoxTitle() {
		
		return "";
	}

	
	public int getErrorStyle() {
		
		return 0;
	}

	
	public String getPromptBoxText() {
		
		return "";
	}

	
	public String getPromptBoxTitle() {
		
		return "";
	}

	
	public CellRangeAddressList getRegions() {
		
		return new CellRangeAddressList();
	}

	
	public boolean getShowErrorBox() {
		
		return false;
	}

	
	public boolean getShowPromptBox() {
		
		return false;
	}

	
	public boolean getSuppressDropDownArrow() {
		
		return false;
	}

	
	public DataValidationConstraint getValidationConstraint() {
		
		return new DataValidationConstraintError();
	}

	
	public void setEmptyCellAllowed(boolean arg0) {
		
		
	}

	
	public void setErrorStyle(int arg0) {
		
		
	}

	
	public void setShowErrorBox(boolean arg0) {
		
		
	}

	
	public void setShowPromptBox(boolean arg0) {
		
		
	}

	
	public void setSuppressDropDownArrow(boolean arg0) {
		
		
	}

	


}
