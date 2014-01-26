package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Name;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.NameError;

import static org.junit.Assert.*;

public class NameErrorTest {
	
	private Name errorName;
	
	@Before
	public void setUp(){
		errorName = new NameError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorName.getSheetIndex(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorName.getComment(),"");
		assertEquals(errorName.getNameName(),"");
		assertEquals(errorName.getRefersToFormula(),"");
		assertEquals(errorName.getSheetName(),"");
	}

}
