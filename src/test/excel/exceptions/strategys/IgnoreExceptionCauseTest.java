package test.excel.exceptions.strategys;

import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.junit.Before;
import org.junit.Test;

import excel.exceptions.strategys.IgnorableExceptions;
import excel.exceptions.strategys.IgnoreExceptionCause;

import static mocks.excel.exceptions.mocks.ExceptionsMock.*;
import static org.junit.Assert.*;

public class IgnoreExceptionCauseTest {
	
	private IgnorableExceptions ignorableExceptionCause;
	
	@Before
	public void setUp(){
		ignorableExceptionCause = new IgnoreExceptionCause(OfficeXmlFileException.class);
	}
	
	@Test
	public void whenCauseExceptionIsEqualsThatConstructorClass(){
		assertTrue(ignorableExceptionCause.isIgnorable(getExceptionWithCausedException(Exception.class,OfficeXmlFileException.class)));
	}
	
	@Test
	public void whenCauseExceptionIsDiferenteThatConstructorClass(){
		assertFalse(ignorableExceptionCause.isIgnorable(getExceptionWithCausedException(OfficeXmlFileException.class,Exception.class)));
	}
	
	@Test
	public void whenCauseExceptionIsNull(){
		assertFalse(ignorableExceptionCause.isIgnorable(getExceptionMockType(OfficeXmlFileException.class)));
	}
}
