package test.excel.errors.model;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.apache.poi.hssf.util.PaneInformation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.AutoFilterError;
import excel.errors.model.CellRangeError;
import excel.errors.model.CellStyleError;
import excel.errors.model.CommentError;
import excel.errors.model.DataValidationHelperError;
import excel.errors.model.DrawingError;
import excel.errors.model.FooterError;
import excel.errors.model.HeaderError;
import excel.errors.model.PrintSetupError;
import excel.errors.model.RowError;
import excel.errors.model.SheetConditionalFormattingError;
import excel.errors.model.SheetError;
import excel.errors.model.WorkbookError;
import excel.errors.model.iterators.RowIteratorError;

public class SheetErrorTest {
	
	private Sheet errorSheet;
	
	@Before
	public void setUp(){
		errorSheet = new SheetError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
			assertEquals(errorSheet.addMergedRegion((CellRangeAddress) anyObject()),0);
			assertEquals(errorSheet.getColumnWidth(anyInt()),0);
			assertEquals(errorSheet.getDefaultColumnWidth(),0);
			assertTrue(errorSheet.getDefaultRowHeightInPoints()==0);
			assertEquals(errorSheet.getFirstRowNum(),0);
			assertEquals(errorSheet.getLastRowNum(),0);
			assertEquals(errorSheet.getLeftCol(),0);
			assertTrue(errorSheet.getMargin(anyShort())==0);
			assertEquals(errorSheet.getNumMergedRegions(),0);
			assertEquals(errorSheet.getPhysicalNumberOfRows(),0);
			assertEquals(errorSheet.getTopRow(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
			 assertEquals(errorSheet.getAutobreaks(),false);
			 assertEquals(errorSheet.getDisplayGuts(),false);
			 assertEquals(errorSheet.getFitToPage(),false);
			 assertEquals(errorSheet.getForceFormulaRecalculation(),false);
			 assertEquals(errorSheet.getHorizontallyCenter(),false);
			 assertEquals(errorSheet.getProtect(),false);
			 assertEquals(errorSheet.getRowSumsBelow(),false);
			 assertEquals(errorSheet.getRowSumsRight(),false);
			 assertEquals(errorSheet.getScenarioProtect(),false);
			 assertEquals(errorSheet.getVerticallyCenter(),false);
			 assertEquals(errorSheet.isColumnBroken(anyInt()),false);
			 assertEquals(errorSheet.isColumnHidden(anyInt()),false);
			 assertEquals(errorSheet.isDisplayFormulas(),false);
			 assertEquals(errorSheet.isDisplayGridlines(),false);
			 assertEquals(errorSheet.isDisplayRowColHeadings(),false);
			 assertEquals(errorSheet.isDisplayZeros(),false);
			 assertEquals(errorSheet.isPrintGridlines(),false);
			 assertEquals(errorSheet.isRightToLeft(),false);
			 assertEquals(errorSheet.isRowBroken(anyInt()),false);
			 assertEquals(errorSheet.isSelected(),false);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorSheet.getSheetName(),"");
	}
	
	
	@Test
	public void whenCallAnyMethodWithReturnedDrawingValue(){
		assertThat(errorSheet.createDrawingPatriarch(),instanceOf(DrawingError.class)); //nueva clase hay que hacer el test
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedRowValue(){
		assertThat(errorSheet.createRow(anyInt()),instanceOf(RowError.class));
		assertThat(errorSheet.getRow(anyInt()),instanceOf(RowError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCommentValue(){
		assertThat(errorSheet.getCellComment(anyInt(), anyInt()),instanceOf(CommentError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellStyleValue(){
		assertThat(errorSheet.getColumnStyle(anyInt()),instanceOf(CellStyleError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedDataValidationHelperValue(){
		assertThat(errorSheet.getDataValidationHelper(),instanceOf(DataValidationHelperError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedFooterValue(){
		assertThat(errorSheet.getFooter(),instanceOf(FooterError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedHeaderValue(){
		assertThat(errorSheet.getHeader(),instanceOf(HeaderError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellRangeAddresstValue(){
		assertThat(errorSheet.getMergedRegion(anyInt()),instanceOf(CellRangeAddress.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedPanelInformationValue(){
		assertThat(errorSheet.getPaneInformation(),instanceOf(PaneInformation.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedPrintSetupValue(){
		assertThat(errorSheet.getPrintSetup(),instanceOf(PrintSetupError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedSheetCondictionalValue(){
		assertThat(errorSheet.getSheetConditionalFormatting(),instanceOf(SheetConditionalFormattingError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedWorkbookValue(){
		assertThat(errorSheet.getWorkbook(),instanceOf(WorkbookError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedErrorCellRangeValue(){
		assertThat(errorSheet.removeArrayFormula((Cell)anyObject()),instanceOf(CellRangeError.class)); 
		assertThat(errorSheet.setArrayFormula(anyString(), (CellRangeAddress) anyObject()),instanceOf(CellRangeError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedAutofilterValue(){
		assertThat(errorSheet.setAutoFilter((CellRangeAddress) anyObject()),instanceOf(AutoFilterError.class)); 
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedIteratorValue(){
		assertThat(errorSheet.iterator(),instanceOf(RowIteratorError.class)); 
		assertThat(errorSheet.rowIterator(),instanceOf(RowIteratorError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedByteArrayValue(){
		assertTrue(errorSheet.getRowBreaks().length==0); 
		assertTrue(errorSheet.getColumnBreaks().length==0); 
	}
	
	
}
