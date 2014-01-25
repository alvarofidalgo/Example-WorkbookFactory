package test.excel.errors.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.FooterError;

public class FooterErrorTest {
	
	private FooterError errorFooter;
	
	@Before
	public void setUp(){
		errorFooter = new FooterError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorFooter.getCenter(),"");
		assertEquals(errorFooter.getLeft(),"");
		assertEquals(errorFooter.getRight(),"");
	}
	
	

}
