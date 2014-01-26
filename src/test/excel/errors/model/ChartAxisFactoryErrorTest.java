package test.excel.errors.model;

import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.junit.Before;
import org.junit.Test;



import excel.errors.model.ChartAxisFactoryError;
import excel.errors.model.ZErrorValueAxis;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ChartAxisFactoryErrorTest {
	
	
	private ChartAxisFactoryError errorChartFactory;
	
	
	@Before
	public void setUp(){
		errorChartFactory = new ChartAxisFactoryError();
	}
	
	@Test
	public void whenCallCreateValueAxis(){
		assertThat(errorChartFactory.createValueAxis((AxisPosition) anyObject()),instanceOf(ZErrorValueAxis.class));
	}

}
