package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ChartAxisFactoryError;
import excel.errors.model.ChartDataFactoryError;
import excel.errors.model.ChartError;
import excel.errors.model.ChartLegendError;
import excel.errors.model.ManualLayoutError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ChartErrorTest {
	
	private ChartError errorChart;
	
	@Before
	public void setUp(){
		errorChart = new ChartError();
	}
	
	@Test
	public void whenCallAnyMathodWithReturnedManualLayoutValue(){
		assertThat(errorChart.getManualLayout(),instanceOf(ManualLayoutError.class));
	}
	
	@Test
	public void whenCallAnyMathodWithReturnedListValue(){
		assertEquals(errorChart.getAxis().size(),0);
	}
	
	@Test
	public void whenCallAnyMathodWithReturnedChartAxisFactoryValue(){
		assertThat(errorChart.getChartAxisFactory(),instanceOf(ChartAxisFactoryError.class));
	}
	
	@Test
	public void whenCallAnyMathodWithReturnedChartDataFactoryValue(){
		assertThat(errorChart.getChartDataFactory(),instanceOf(ChartDataFactoryError.class));
	}
	
	@Test
	public void whenCallAnyMathodWithReturnedChartLegendValue(){
		assertThat(errorChart.getOrCreateLegend(),instanceOf(ChartLegendError.class));
	}

}
