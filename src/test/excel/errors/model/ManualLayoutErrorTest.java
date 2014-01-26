package test.excel.errors.model;

import static org.junit.Assert.*;

import org.apache.poi.ss.usermodel.charts.LayoutMode;
import org.apache.poi.ss.usermodel.charts.LayoutTarget;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ManualLayoutError;


public class ManualLayoutErrorTest {
	
	private  ManualLayoutError errorManualLayout;
	
	
	@Before
	public void setUp(){
		errorManualLayout = new ManualLayoutError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertTrue(errorManualLayout.getHeightRatio()==0);
		assertTrue(errorManualLayout.getWidthRatio()==0);
		assertTrue(errorManualLayout.getX()==0);
		assertTrue(errorManualLayout.getY()==0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedLayoutValue(){
		assertEquals(errorManualLayout.getHeightMode(),LayoutMode.EDGE);
		assertEquals(errorManualLayout.getWidthMode(),LayoutMode.EDGE);
		assertEquals(errorManualLayout.getXMode(),LayoutMode.EDGE);
		assertEquals(errorManualLayout.getYMode(),LayoutMode.EDGE);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedLayoutTargetValue(){
		assertEquals(errorManualLayout.getTarget(),LayoutTarget.INNER);

	}

}
