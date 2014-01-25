package test.excel.errors.model;

import org.apache.poi.ss.usermodel.RichTextString;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.RichTextStringError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;

public class RichTextStringErrorTest {
	
	private RichTextString errorRichTextString;
	
	
	@Before
	public void setUp(){
		errorRichTextString = new RichTextStringError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorRichTextString.getIndexOfFormattingRun(anyInt()),0);
		assertEquals(errorRichTextString.length(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorRichTextString.getString(),"");
	}
}
