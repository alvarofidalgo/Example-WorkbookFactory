package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.CellStyleError;
import excel.errors.model.CreationHelperError;
import excel.errors.model.DataFormatError;
import excel.errors.model.FontError;
import excel.errors.model.NameError;
import excel.errors.model.SheetError;
import excel.errors.model.WorkbookError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;



public class WorkbookErrorTest {
	
	private Workbook errroWorkbook;
	
	
	@Before
	public void setUp(){
		errroWorkbook = new WorkbookError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){

		assertEquals(errroWorkbook.addPicture(anyByteArray(), anyInt()),-1);
		assertEquals(errroWorkbook.getActiveSheetIndex(),-1);		
		assertEquals(errroWorkbook.getFirstVisibleTab(),-1);	
		assertEquals(errroWorkbook.getNameIndex(anyString()),-1);
		assertEquals(errroWorkbook.getNumberOfFonts(),0);
		assertEquals(errroWorkbook.getNumberOfNames(),0);
		assertEquals(errroWorkbook.getNumberOfSheets(),0);
		assertEquals(errroWorkbook.getNumCellStyles(),0);	
		assertEquals(errroWorkbook.getSheetIndex(anyString()),-1);
		assertEquals(errroWorkbook.getSheetIndex((Sheet)anyObject()),-1);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errroWorkbook.getForceFormulaRecalculation(),false);		
		assertEquals(errroWorkbook.isHidden(),false);
		assertEquals(errroWorkbook.isSheetHidden(anyInt()),false);
		assertEquals(errroWorkbook.isSheetVeryHidden(anyInt()),false);		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringnValue(){
		assertEquals(errroWorkbook.getPrintArea(anyInt()),"");
		assertEquals(errroWorkbook.getSheetName(anyInt()),"");
	}
	
	
	@Test
	public void whenCallAnyMethodWithReturnedListValue(){
		assertTrue(errroWorkbook.getAllPictures().isEmpty());
	}
	
	
	@Test
	public void whenCallAnyMethoWithReturnedSheet(){
		assertThat(errroWorkbook.cloneSheet(anyInt()),instanceOf(SheetError.class));	
		assertThat(errroWorkbook.createSheet(),instanceOf(SheetError.class));
		assertThat(errroWorkbook.createSheet(anyString()),instanceOf(SheetError.class));
		assertThat(errroWorkbook.getSheet(anyString()),instanceOf(SheetError.class));
		assertThat(errroWorkbook.getSheetAt(anyInt()),instanceOf(SheetError.class));
	}
	
	@Test
	public void whenCallAnyMethoWithReturnedCellStyle(){
		assertThat(errroWorkbook.createCellStyle(),instanceOf(CellStyleError.class));
		assertThat(errroWorkbook.getCellStyleAt(anyShort()),instanceOf(CellStyleError.class));	
	}
	
	@Test
	public void whenCallAnyMethoWithReturnedFont(){
		assertThat(errroWorkbook.createFont(),instanceOf(FontError.class));
		assertThat(errroWorkbook.findFont(anyShort(),anyShort(), 
				                           anyShort(),anyString(), 
				                           anyBoolean(), anyBoolean(),
				                           anyShort(),anyByte()),
                instanceOf(FontError.class));
		assertThat(errroWorkbook.getFontAt(anyShort()),instanceOf(FontError.class));
	}
	
	@Test
	public void whenCallAnyMethoWithReturnedName(){
		assertThat(errroWorkbook.createName(),instanceOf(NameError.class));
		assertThat(errroWorkbook.getName(anyString()),instanceOf(NameError.class));
		assertThat(errroWorkbook.getNameAt(anyInt()),instanceOf(NameError.class));
	}
	
	@Test
	public void whenCallAnyMethoWithReturnedDataFormat(){
		assertThat(errroWorkbook.createDataFormat(),instanceOf(DataFormatError.class));
	}
	
	@Test
	public void whenCallAnyMethoWithReturnedCreationHelper(){
		assertThat(errroWorkbook.getCreationHelper(),instanceOf(CreationHelperError.class));
	}
	
	@Test
	public void whenCallAnyMethodReturnedMissingCellPolicy(){		
		assertEquals(errroWorkbook.getMissingCellPolicy(),Row.CREATE_NULL_AS_BLANK);
	}
}
