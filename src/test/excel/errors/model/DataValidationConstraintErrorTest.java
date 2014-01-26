package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;


import excel.errors.model.DataValidationConstraintError;

public class DataValidationConstraintErrorTest {
	
	private DataValidationConstraintError errorDataConstrainst;
	
	
	@Before
	public void setUp(){
		errorDataConstrainst = new DataValidationConstraintError();
	}
	
	@Test
	public void whenCallMethodWithReturnedNumericValue(){
		assertEquals(errorDataConstrainst.getOperator(),0);
		assertEquals(errorDataConstrainst.getValidationType(),0);
		
	}
	
	@Test
	public void whenCallMethodWithStringValue(){
		assertEquals(errorDataConstrainst.getFormula1(),"");
		assertEquals(errorDataConstrainst.getFormula2(),"");
		assertEquals(errorDataConstrainst.getExplicitListValues().length,0);
		
	}

}
