package excel.validators;

import org.apache.poi.ss.usermodel.Workbook;

import excel.errors.model.WorkbookError;

public class ValidatorWorkbookNotErrorType implements ValidatorWorkbook {


	public boolean isValid(Workbook workbook) {

		return  !(workbook instanceof WorkbookError);
	}

}
