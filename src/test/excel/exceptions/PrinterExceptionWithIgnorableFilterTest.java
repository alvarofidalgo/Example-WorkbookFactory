package test.excel.exceptions;

import static mocks.excel.exceptions.ExceptionsMock.*;
import static org.junit.Assert.*;

import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.junit.Before;
import org.junit.Test;


import excel.exceptions.PrinterException;
import excel.exceptions.PrinterExceptionWithIgnorableFilter;
import excel.exceptions.SimplePrinterException;
import excel.exceptions.strategys.IgnoreExceptionCause;


public class PrinterExceptionWithIgnorableFilterTest {
	
	private PrinterException simpleException;
		
	@Before
	public void setUp(){
		simpleException = new SimplePrinterException(
				getExceptionWithCausedRealException(Exception.class,new OfficeXmlFileException(null)));		
	}
	
	@Test
	public void whenCallPrintStackTraceAndExceptionIsTypeIgnorable(){
	
		PrinterException exceptionWithFilter = new PrinterExceptionWithIgnorableFilter(simpleException,
				            		                                             new IgnoreExceptionCause(OfficeXmlFileException.class));
		exceptionWithFilter.printStackTrace();
		assertTrue(verifiCallPrintStactTraceParameterTimes(0));
	}
	
	@Test
	public void whenCallPrintStackTraceAndExceptionIsTypeNotIgnorable(){
		PrinterException exceptionWithFilter = new PrinterExceptionWithIgnorableFilter(simpleException,
				            		                                             new IgnoreExceptionCause(Exception.class));
		exceptionWithFilter.printStackTrace();
		assertTrue(verifiCallPrintStactTraceParameterTimes(1));
	}

}
