package test.excel.errors.lang;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.errors.lang.NumberError;

public class NumberErrorTest {
	
	private NumberError errorNumber;
	
	@Before
	public void setUp(){
		errorNumber = new NumberError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValues(){
		assertTrue(errorNumber.doubleValue()==0);
		assertEquals(errorNumber.intValue(),0);
		assertTrue(errorNumber.floatValue()==0);
		assertEquals(errorNumber.longValue(),0);	
	}
}
