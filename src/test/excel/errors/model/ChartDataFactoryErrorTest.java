package test.excel.errors.model;


import org.junit.Before;

import excel.errors.model.ChartDataFactoryError;
import excel.errors.model.ScatterChartDataError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ChartDataFactoryErrorTest {
	
	private ChartDataFactoryError errorChartDataFactory;
	
	@Before
	public void setUp(){
		errorChartDataFactory = new ChartDataFactoryError();
	}
	
	public void whenCallCreateScatterChartData(){
		assertThat(errorChartDataFactory.createScatterChartData(),instanceOf(ScatterChartDataError.class));
	}

}
