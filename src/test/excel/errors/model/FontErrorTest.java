package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Font;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.FontError;
import static org.junit.Assert.*;

public class FontErrorTest {
	
	private Font errorFont;
	
	@Before
	public void setUp(){
		errorFont = new FontError();		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorFont.getBoldweight(),0);
		assertEquals(errorFont.getCharSet(),0);
		assertEquals(errorFont.getColor(),0);
		assertEquals(errorFont.getFontHeight(),0);
		assertEquals(errorFont.getFontHeightInPoints(),0);
		assertEquals(errorFont.getIndex(),0);
		assertEquals(errorFont.getTypeOffset(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorFont.getItalic(),false);
		assertEquals(errorFont.getStrikeout(),false);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorFont.getFontName(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedbyteValue(){
		assertEquals(errorFont.getUnderline(),0);
	}
}
