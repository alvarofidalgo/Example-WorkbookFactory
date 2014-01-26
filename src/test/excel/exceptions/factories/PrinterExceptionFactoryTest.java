package test.excel.exceptions.factories;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.exceptions.PrinterException;
import excel.exceptions.PrinterExceptionWithIgnorableFilter;
import excel.exceptions.SimplePrinterException;
import excel.exceptions.factories.PrinterExceptionFactory;
import excel.exceptions.strategys.IgnoreExceptionCause;

public class PrinterExceptionFactoryTest {
	
	private PrinterExceptionFactory printerFactory;
		
	@Before
	public void setUp(){
		printerFactory = new PrinterExceptionFactory();
	}
	
	@Test
	public void whenCallCreatWithoutFilter(){
		PrinterException personalPrinter  = printerFactory.create(new Exception());
		assertTrue(personalPrinter instanceof SimplePrinterException);
	}
	
	@Test
	public void whenAddFilterAndCallCreate(){
		PrinterException personalPrinter  = printerFactory.
				                            addStrategyIgnore(new IgnoreExceptionCause(Exception.class)).
				                            create(new Exception());
		assertTrue(personalPrinter instanceof PrinterExceptionWithIgnorableFilter);
	}

}
