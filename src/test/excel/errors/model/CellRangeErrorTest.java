package test.excel.errors.model;


import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CellError;
import excel.errors.model.CellRangeError;
import excel.errors.model.iterators.ErrorCellterator;


public class CellRangeErrorTest {
	
	private CellRangeError<Cell> errorCellRange;
	
	@Before
	public void setUp(){
		errorCellRange = new CellRangeError<Cell>();
	}
	
	@Test
	public void whenCallAnyMethodReturnedNumericValue(){
		assertEquals(errorCellRange.getHeight(),0);
		assertEquals(errorCellRange.getWidth(),0);
		assertEquals(errorCellRange.size(),0);
	}
	
	@Test
	public void whenCallAnyMethodReturnedStringValue(){
		assertEquals(errorCellRange.getReferenceText(),"");

	}
	
	@Test
	public void whenCallAnyMethodReturnedCValue(){
		assertThat(errorCellRange.getCell(anyInt(), anyInt()),instanceOf(CellError.class));
		assertThat(errorCellRange.getTopLeftCell(),instanceOf(CellError.class));

	}
	
	@Test
	public void whenCallAnyMethodReturnedArrayCValue(){
		assertEquals(errorCellRange.getCells().length,0);
		assertEquals(errorCellRange.getFlattenedCells().length,0);
		

	}
	
	@Test
	public void whenCallAnyMethodReturnedIteratorValue(){
		assertThat(errorCellRange.iterator(),instanceOf(ErrorCellterator.class));
	}

}
