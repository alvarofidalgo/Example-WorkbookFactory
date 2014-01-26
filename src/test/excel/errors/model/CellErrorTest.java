package test.excel.errors.model;

import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CellError;
import excel.errors.model.CellStyleError;
import excel.errors.model.CommentError;
import excel.errors.model.HyperlinkError;
import excel.errors.model.RichTextStringError;
import excel.errors.model.RowError;
import excel.errors.model.SheetError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CellErrorTest {
	
	private Cell errorCell;
	
	@Before
	public void setUp(){
		errorCell = new CellError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorCell.getCachedFormulaResultType(),0);
		assertEquals(errorCell.getCellType(),Cell.CELL_TYPE_ERROR);
		assertEquals(errorCell.getColumnIndex(),0);
		assertTrue(errorCell.getNumericCellValue()==0);
		assertEquals(errorCell.getRowIndex(),-1);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorCell.getCellFormula(),"");
		assertEquals(errorCell.getStringCellValue(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorCell.getBooleanCellValue(),false);
		assertEquals(errorCell.isPartOfArrayFormulaGroup(),false);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedByteValue(){
		assertEquals(errorCell.getErrorCellValue(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellStyleValue(){
		assertThat(errorCell.getCellStyle(),instanceOf(CellStyleError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellHyperLinkValue(){
		assertThat(errorCell.getHyperlink(),instanceOf(HyperlinkError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellRichTextStringValue(){
		assertThat(errorCell.getRichStringCellValue(),instanceOf(RichTextStringError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedSheetValue(){
		assertThat(errorCell.getSheet(),instanceOf(SheetError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedSDateValue(){
		assertEquals(errorCell.getDateCellValue(),new Date(0));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedRowValue(){
		assertThat(errorCell.getRow(),instanceOf(RowError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCommentValue(){
		assertThat(errorCell.getCellComment(),instanceOf(CommentError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithCellRangeAddressCommentValue(){
		assertThat(errorCell.getArrayFormulaRange(),instanceOf(CellRangeAddress.class));
	}
	
}
