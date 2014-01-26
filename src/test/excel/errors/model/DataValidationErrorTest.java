package test.excel.errors.model;

import org.apache.poi.ss.util.CellRangeAddressList;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.DataValidationConstraintError;
import excel.errors.model.DataValidationError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DataValidationErrorTest {
	
	private DataValidationError errorDataValidation;
	
	@Before
	public void setUp() {
		errorDataValidation = new DataValidationError();
	}
	
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorDataValidation.getErrorStyle(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorDataValidation.getEmptyCellAllowed(),false);
		assertEquals(errorDataValidation.getShowErrorBox(),false);
		assertEquals(errorDataValidation.getShowPromptBox(),false);
		assertEquals(errorDataValidation.getSuppressDropDownArrow(),false);
		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorDataValidation.getErrorBoxText(),"");
		assertEquals(errorDataValidation.getErrorBoxTitle(),"");
		assertEquals(errorDataValidation.getPromptBoxText(),"");
		assertEquals(errorDataValidation.getPromptBoxTitle(),"");
		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedDataValidationConstrainstValue(){
		assertThat(errorDataValidation.getValidationConstraint(),instanceOf(DataValidationConstraintError.class));	
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellRangeAddressListValue(){
		assertThat(errorDataValidation.getRegions(),instanceOf(CellRangeAddressList.class));	
	}
}
