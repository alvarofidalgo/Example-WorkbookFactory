package test.excel.errors.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.PrintSetupError;

public class PrintSetupErrorTest {
	
	private PrintSetupError errorPrintSetup;
	
	
	@Before
	public void setUp(){
		errorPrintSetup = new PrintSetupError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorPrintSetup.getCopies(),0);
		assertEquals(errorPrintSetup.getFitHeight(),0);
		assertEquals(errorPrintSetup.getFitWidth(),0);
		assertTrue(errorPrintSetup.getFooterMargin()==0);
		assertTrue(errorPrintSetup.getHeaderMargin()==0);
		assertEquals(errorPrintSetup.getHResolution(),0);
		assertEquals(errorPrintSetup.getPageStart(),0);
		assertEquals(errorPrintSetup.getPaperSize(),0);
		assertEquals(errorPrintSetup.getScale(),0);
		assertEquals(errorPrintSetup.getVResolution(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorPrintSetup.getDraft(),false);
		assertEquals(errorPrintSetup.getLandscape(),false);
		assertEquals(errorPrintSetup.getLeftToRight(),false);
		assertEquals(errorPrintSetup.getNoColor(),false);
		assertEquals(errorPrintSetup.getNoOrientation(),false);
		assertEquals(errorPrintSetup.getNotes(),false);
		assertEquals(errorPrintSetup.getUsePage(),false);
		assertEquals(errorPrintSetup.getValidSettings(),false);
	}

}
