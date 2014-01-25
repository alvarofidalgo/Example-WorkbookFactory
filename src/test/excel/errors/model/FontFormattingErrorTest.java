package test.excel.errors.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.FontFormattingError;



public class FontFormattingErrorTest {
	
	
	private FontFormattingError errorFontFormatting;
	
	
	@Before
	public void setUp(){
		errorFontFormatting = new FontFormattingError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorFontFormatting.getEscapementType(),0);
		assertEquals(errorFontFormatting.getFontColorIndex(),0);
		assertEquals(errorFontFormatting.getFontHeight(),0);
		assertEquals(errorFontFormatting.getUnderlineType(),0);

	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorFontFormatting.isBold(),false);
		assertEquals(errorFontFormatting.isItalic(),false);

	}

}
