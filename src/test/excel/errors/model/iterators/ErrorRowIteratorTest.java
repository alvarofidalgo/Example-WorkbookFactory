package test.excel.errors.model.iterators;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Iterator;


import org.apache.poi.ss.usermodel.Row;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.RowError;
import excel.errors.model.iterators.ErrorRowIterator;

public class ErrorRowIteratorTest {
	
	private Iterator<Row> errorCellterator;
	
	@Before
	public void setUp(){
		errorCellterator = new ErrorRowIterator<Row>();
	}
	
	@Test
	public void whenCallHashNext(){
	  assertEquals(errorCellterator.hasNext(),false);	
	}
	
	@Test
	public void whenCallhNext(){
	  assertThat(errorCellterator.next(),instanceOf(RowError.class));	
	}
}
