package test.excel.errors.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.HeaderError;

public class HeaderErrorTest {
	
	private HeaderError errorHeader;
	
	
	@Before
	public void setUp(){
		errorHeader = new HeaderError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorHeader.getCenter(),"");
		assertEquals(errorHeader.getLeft(),"");
		assertEquals(errorHeader.getRight(),"");
	}

}
