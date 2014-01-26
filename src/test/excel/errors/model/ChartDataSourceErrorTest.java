package test.excel.errors.model;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.apache.poi.ss.formula.functions.T;
import org.junit.Before;
import org.junit.Test;

import excel.errors.lang.NumberError;
import excel.errors.model.ChartDataSourceError;



public class ChartDataSourceErrorTest {
	
	private ChartDataSourceError<T> errorChartDataSource;
	
	@Before
	public void setUp(){
		errorChartDataSource = new ChartDataSourceError<T>();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorChartDataSource.isNumeric(),false);
		assertEquals(errorChartDataSource.isReference(),false);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorChartDataSource.getFormulaString(),"");

	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorChartDataSource.getPointCount(),0);

	}
	
	@Test
	public void whenCallAnyMethodWithReturnedTValue(){
		assertThat(errorChartDataSource.getPointAt(anyInt()),instanceOf(NumberError.class));

	}
	
	

}
