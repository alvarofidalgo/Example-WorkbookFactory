package test.excel.reflect;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.WorkbookError;
import excel.reflect.WorkbookCreator;
import static test.operations.commons.OperationsInputStream.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import static test.operations.commons.RedirectStandardError.*;


public class WorkbookCreatorTest {
	
	private String beforeError ="";
	
	@Before
	public void setUp(){
		assignNewStandardError();
		beforeError  = getResultError();
	}
	
	@After
	public void shutDown(){
		refreshStandardError();
	}
	
			
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLXAndclassIsXSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(XSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLSX)),
				   instanceOf(XSSFWorkbook.class));
		assertEquals(beforeError,getResultError());
	}
	
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLAndclassIsHSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(HSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLS)),
				   instanceOf(HSSFWorkbook.class));
		assertEquals(beforeError,getResultError());
	}
	
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLAndclassIsXSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(HSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLSX)),
				   instanceOf(WorkbookError.class));
		assertEquals(beforeError,getResultError());
	}
	
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLXAndclassIsHSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(XSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLS)),
				   instanceOf(WorkbookError.class));
		assertEquals(beforeError,getResultError());
	}
	
}
