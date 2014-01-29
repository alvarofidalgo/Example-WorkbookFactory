package test.excel.reflect;

import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import excel.exceptions.PrinterException;
import excel.reflect.WorkbookCreatorEnvolver;
import static org.junit.Assert.*;
import static test.operations.commons.OperationsInputStream.*;
import static test.operations.commons.RedirectStandardError.*;
import static org.hamcrest.CoreMatchers.*;


public class WorkbookCreatorEnvolverTest {
			
	
	@Before
	public void setUP(){

		assignNewStandardError();
	}
	
	@After
	public void shutDown(){

		refreshStandardError();
	}
	
	@Test
	public void whenCallCreateWorkBookAndISXLSXfileAndXSSFWorkbookClass(){
		 try{
			 assertTrue (workbookGeneratorWithEnvolver(XSSFWorkbook.class,getInputStream(FILE_XLSX)) instanceof XSSFWorkbook);		 
		 }catch (PrinterException e){
			 fail("");
		 }
	}
	
	@Test
	public void whenCallCreateWorkBookAndISXLXfileAndHSSFWorkbookClass(){
		 try{
			 assertTrue (workbookGeneratorWithEnvolver(HSSFWorkbook.class,getInputStream(FILE_XLS)) instanceof HSSFWorkbook);		 
		 }catch (PrinterException e){
			 fail("");
		 }
	}
	
	@Test
	public void whenCallCreateWorkBookAndISXLXSfileAndHSSFWorkbookClass(){
		String beforeError = getResultError().toString();
		try{
			workbookGeneratorWithEnvolver(HSSFWorkbook.class,getInputStream(FILE_XLSX));		
			 fail("");
		 }catch (PrinterException e){
			 e.printStackTrace();
		     assertEquals(getResultError(),beforeError);
		 }
	}
	
	@Test
	public void whenCallCreateWorkBookAndISXLXfileAndXSSFWorkbookClass(){
		String beforeError = getResultError().toString();
		 try{
			workbookGeneratorWithEnvolver(XSSFWorkbook.class,getInputStream(FILE_XLS));		
			 fail("");
		 }catch (PrinterException e){
			 e.printStackTrace();
			 
		   assertEquals(getResultError(),beforeError);
		 }
	}
	
	@Test
	public void whenCallCreateWorkBookAndThrowPrintableException(){
		String beforeError = getResultError().toString();
		 try{
			workbookGeneratorWithEnvolver(WorkbookCreatorEnvolver.class,getInputStream(FILE_XLS));		
			 fail("");
		 }catch (PrinterException e){
		    e.printStackTrace();
		    assertThat(beforeError, is(not(getResultError())));

		 }
	}
	
	private Workbook workbookGeneratorWithEnvolver(Class<?> constructorParameter,
			                                              InputStream streamParameter) throws PrinterException{		
		WorkbookCreatorEnvolver workbookCreatorEnvolver = new WorkbookCreatorEnvolver(constructorParameter);
		return workbookCreatorEnvolver.createWorkBook(streamParameter);
	}
	
}
