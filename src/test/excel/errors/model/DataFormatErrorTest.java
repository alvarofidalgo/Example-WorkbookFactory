package test.excel.errors.model;

import org.apache.poi.ss.usermodel.DataFormat;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.DataFormatError;
import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;

public class DataFormatErrorTest {
	
	private DataFormat errorDataFormat;
	
	@Before
	public void setUp(){
		errorDataFormat = new DataFormatError();	
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorDataFormat.getFormat(anyString()),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorDataFormat.getFormat(anyShort()),"");
	}
}
