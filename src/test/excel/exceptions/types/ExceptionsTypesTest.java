package test.excel.exceptions.types;

import static excel.exceptions.types.ExceptionsTypes.*;
import static mocks.excel.exceptions.mocks.ExceptionsMock.*;
import static org.junit.Assert.*;

import org.apache.poi.POIXMLException;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.junit.Test;


import excel.exceptions.PrinterException;


public class ExceptionsTypesTest {
	
	@Test
	public void whenCallIgnoreCauseOfficeXmlFileExceptionAndPOIXMLExceptionAndExceptionTypeIsOfficeXmlFile(){

		PrinterException printerException = ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(
				                                     getExceptionWithCausedException(Exception.class,OfficeXmlFileException.class));
		printerException.printStackTrace();
		assertTrue(verifiCallPrintStactTraceParameterTimes(0));
	}
	
	@Test
	public void whenCallIgnoreCauseOfficeXmlFileExceptionAndPOIXMLExceptionAndExceptionTypeIsPOIXML(){

		PrinterException printerException = ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(
				                                   getExceptionWithCausedRealException(Exception.class,new POIXMLException()));
		printerException.printStackTrace();
		assertTrue(verifiCallPrintStactTraceParameterTimes(0));
	}
	
	@Test
	public void whenCallIgnoreCauseOfficeXmlFileExceptionAndPOIXMLExceptionAndExceptionIsOtherCause(){
		PrinterException printerException = ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(
				                              getExceptionWithCausedException(Exception.class,Exception.class));
        printerException.printStackTrace();
        assertTrue(verifiCallPrintStactTraceParameterTimes(1));
 	}
}
