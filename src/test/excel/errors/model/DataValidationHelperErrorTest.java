package test.excel.errors.model;

import org.apache.poi.ss.usermodel.DataValidationConstraint;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.DataValidationConstraintError;
import excel.errors.model.DataValidationError;
import excel.errors.model.DataValidationHelperError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DataValidationHelperErrorTest {
	
	private DataValidationHelperError errorDataValidator;
	
	@Before
	public void setUp(){
		errorDataValidator = new DataValidationHelperError();
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedDataValidationConstraintValue(){
		
		assertThat(errorDataValidator.createDateConstraint(anyInt(), anyString(), anyString(), anyString()),
				                                            instanceOf(DataValidationConstraintError.class));
		assertThat(errorDataValidator.createDecimalConstraint(anyInt(), anyString(), anyString()),
                                                            instanceOf(DataValidationConstraintError.class));
		assertThat(errorDataValidator.createExplicitListConstraint((String[]) anyObject()),
                                                         	instanceOf(DataValidationConstraintError.class));
		assertThat(errorDataValidator.createCustomConstraint( anyString()),
															instanceOf(DataValidationConstraintError.class));
		assertThat(errorDataValidator.createFormulaListConstraint(anyString()),
                                                     		instanceOf(DataValidationConstraintError.class));
		assertThat(errorDataValidator.createIntegerConstraint(anyInt(), anyString(), anyString()),
															instanceOf(DataValidationConstraintError.class));	
		assertThat(errorDataValidator.createNumericConstraint(anyInt(),anyInt(), anyString(), anyString()),
                                                     		instanceOf(DataValidationConstraintError.class));	
		assertThat(errorDataValidator.createTextLengthConstraint(anyInt(), anyString(), anyString()),
                                                       		instanceOf(DataValidationConstraintError.class));		
		assertThat(errorDataValidator.createTimeConstraint(anyInt(), anyString(), anyString()),
           													instanceOf(DataValidationConstraintError.class));
		
		
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedDataValidationValue(){
		
		assertThat(errorDataValidator.createValidation((DataValidationConstraint)anyObject(),(CellRangeAddressList) anyObject()),
				                                            instanceOf(DataValidationError.class));
		
		
		
	}
	
	

}
