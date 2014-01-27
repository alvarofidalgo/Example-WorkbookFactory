package test.excel.validators;


import static org.junit.Assert.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.WorkbookError;
import excel.validators.ValidatorWorkbook;
import excel.validators.ValidatorWorkbookNotErrorType;

public class ValidatorWorkbookTest {
	
	private ValidatorWorkbook validatorWorkbook;

	
	@Before
	public void setUp(){
		validatorWorkbook = new ValidatorWorkbookNotErrorType();
	}
	
	@Test
	public void whenCallIsValidAndWorkbookIsNotErrorType(){

		assertTrue(validatorWorkbook.isValid(new HSSFWorkbook()));
	}
	@Test
	public void whenCallIsValidAndWorkbookIsErrorType(){

		assertFalse(validatorWorkbook.isValid(new WorkbookError()));
	}

}
