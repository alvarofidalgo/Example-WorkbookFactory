package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Hyperlink;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.HyperlinkError;

import static org.junit.Assert.*;

public class HyperlinkErrorTest {
	
	private Hyperlink errorHiperLink;
	
	@Before
	public void setUp(){
		errorHiperLink = new HyperlinkError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorHiperLink.getFirstColumn(),0);
		assertEquals(errorHiperLink.getFirstRow(),0);
		assertEquals(errorHiperLink.getLastColumn(),0);
		assertEquals(errorHiperLink.getLastRow(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorHiperLink.getAddress(),"");
		assertEquals(errorHiperLink.getLabel(),"");

	}
}
