package test.excel.errors.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.PatternFormattingError;

public class PatternFormattingErrorTest {
	
	private PatternFormattingError errorPatternFormatting;
	
	@Before
	public void setUp(){
		errorPatternFormatting = new PatternFormattingError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValues(){
		assertEquals(errorPatternFormatting.getFillBackgroundColor(),0);
		assertEquals(errorPatternFormatting.getFillForegroundColor(),0);
		assertEquals(errorPatternFormatting.getFillPattern(),0);

	}

}
