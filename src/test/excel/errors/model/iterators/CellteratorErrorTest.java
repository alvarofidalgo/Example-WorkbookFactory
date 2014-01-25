package test.excel.errors.model.iterators;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CellError;
import excel.errors.model.iterators.CellteratorError;

public class CellteratorErrorTest {
	
	private Iterator<Cell> errorCellterator;
	
	@Before
	public void setUp(){
		errorCellterator = new CellteratorError<Cell>();
	}
	
	@Test
	public void whenCallHashNext(){
	  assertEquals(errorCellterator.hasNext(),false);	
	}
	
	@Test
	public void whenCallhNext(){
	  assertThat(errorCellterator.next(),instanceOf(CellError.class));	
	}

}
