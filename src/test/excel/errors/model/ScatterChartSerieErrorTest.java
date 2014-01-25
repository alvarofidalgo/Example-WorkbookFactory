package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ChartDataSourceError;
import excel.errors.model.ScatterChartSerieError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ScatterChartSerieErrorTest {
	
	private ScatterChartSerieError errorScatterChartSerie;
	
	
	@Before
	public void setUp(){
		errorScatterChartSerie = new ScatterChartSerieError();
	}
	
	@Test
	public void whenCallMethodWithReturnedChartDataSourceValue(){
		assertThat(errorScatterChartSerie.getXValues(),instanceOf(ChartDataSourceError.class));
		assertThat(errorScatterChartSerie.getYValues(),instanceOf(ChartDataSourceError.class));
	}
	
	

}
