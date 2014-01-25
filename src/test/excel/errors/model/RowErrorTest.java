package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.junit.Before;
import org.junit.Test;


import excel.errors.model.CellError;
import excel.errors.model.CellStyleError;
import excel.errors.model.RowError;
import excel.errors.model.SheetError;
import excel.errors.model.iterators.CellteratorError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class RowErrorTest {
	
	private RowError errorrow;
	
	
	@Before
	public void setUp(){
		errorrow = new RowError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorrow.getFirstCellNum(),0);
		assertTrue(errorrow.getHeightInPoints()==0);
		assertEquals(errorrow.getHeight(),0);
		assertEquals(errorrow.getLastCellNum(),0);
		assertEquals(errorrow.getPhysicalNumberOfCells(),0);
		assertEquals(errorrow.getRowNum(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorrow.getZeroHeight(),false);
		assertEquals(errorrow.isFormatted(),false);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellStyleValue(){
		assertThat(errorrow.getRowStyle(),instanceOf(CellStyleError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellValue(){
		assertThat(errorrow.createCell(anyInt()),instanceOf(CellError.class));
		assertThat(errorrow.createCell(anyInt(), anyInt()),instanceOf(CellError.class));
		assertThat(errorrow.getCell(anyInt()),instanceOf(CellError.class));
		assertThat(errorrow.getCell(anyInt(), (MissingCellPolicy) anyObject()),instanceOf(CellError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedSheetValue(){
		assertThat(errorrow.getSheet(),instanceOf(SheetError.class));
	}
	

	@Test
	public void whenCallAnyMethodWithReturnedIteratorValue(){
		assertThat(errorrow.cellIterator(),instanceOf(CellteratorError.class));
		assertThat(errorrow.iterator(),instanceOf(CellteratorError.class));
	}
	
}
