package test.excel.exceptions;

import static mocks.excel.exceptions.ExceptionsMock.*;
import static org.junit.Assert.*;

import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.junit.Before;
import org.junit.Test;

import excel.exceptions.SimplePrinterException;

public class SimplePrinterExceptionTest {
	
	private SimplePrinterException simplePrinterException;
	
	@Before
	public void setUp(){
		simplePrinterException = new SimplePrinterException(getExceptionMockType(OfficeXmlFileException.class));
	}
	
	@Test
	public void whenCallPrintStackTrace(){
		simplePrinterException.printStackTrace();
		assertTrue(verifiCallPrintStactTraceParameterTimes(1));
	}
}
