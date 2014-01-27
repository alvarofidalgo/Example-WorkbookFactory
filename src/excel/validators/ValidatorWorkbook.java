package excel.validators;

import org.apache.poi.ss.usermodel.Workbook;

public interface ValidatorWorkbook {
	
	public boolean isValid(Workbook workbook);

}
