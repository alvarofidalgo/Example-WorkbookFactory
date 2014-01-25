package test.excel.errors.model;

import org.apache.poi.ss.usermodel.charts.LegendPosition;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ChartLegendError;
import excel.errors.model.ManualLayoutError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ChartLegendErrorTest {
	
	private ChartLegendError errorChartLegend;
	
	@Before
	public void setUp(){
		errorChartLegend = new ChartLegendError();
	}
	
	@Test
	public void whenCallAnyMthodWithReturnedManualLayoutValue(){
		assertThat(errorChartLegend.getManualLayout(),instanceOf(ManualLayoutError.class));
	}
	
	@Test
	public void whenCallAnyMthodWithReturnedLegendPositionValue(){
		assertEquals(errorChartLegend.getPosition(),LegendPosition.BOTTOM);
	}

}
