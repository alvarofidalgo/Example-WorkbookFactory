package test.excel.reflect;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import excel.errors.model.WorkbookError;
import excel.reflect.WorkbookCreator;
import static test.operations.commons.OperationsInputStream.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class WorkbookCreatorTest {
	
			
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLXAndclassIsXSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(XSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLSX)),
				   instanceOf(XSSFWorkbook.class));
	}
	
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLAndclassIsHSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(HSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLS)),
				   instanceOf(HSSFWorkbook.class));
	}
	
	@Test
	public void createWorkBookByReflectionAndInputStreamIsXSLAndclassIsXSSFWorkbook(){
		WorkbookCreator workbookCreator = new WorkbookCreator(HSSFWorkbook.class); 
		assertThat(workbookCreator.createWorkBookByReflection(getInputStream(FILE_XLSX)),
				   instanceOf(WorkbookError.class));
	}
}
