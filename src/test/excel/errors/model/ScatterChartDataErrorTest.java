package test.excel.errors.model;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ScatterChartDataError;
import excel.errors.model.ScatterChartSerieError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ScatterChartDataErrorTest {
	
	private ScatterChartDataError errorScatterChartData;
	
	@Before
	public void setUp(){
		errorScatterChartData = new ScatterChartDataError();
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void whenCallAnyMethodWithReturnedScatterChartSerieValue(){
		assertThat(errorScatterChartData.addSerie((ChartDataSource<?>)anyObject(), (ChartDataSource<Number>)anyObject()),instanceOf(ScatterChartSerieError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedListValue(){
		assertEquals(errorScatterChartData.getSeries().size(),0);
	}

}
