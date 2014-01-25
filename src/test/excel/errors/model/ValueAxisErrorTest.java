package test.excel.errors.model;

import static org.junit.Assert.*;

import org.apache.poi.ss.usermodel.charts.AxisCrossBetween;
import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisOrientation;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ValueAxisError;

public class ValueAxisErrorTest {
	
	private ValueAxisError errorValueAxis;
	
	@Before
	public void setUp(){
		errorValueAxis = new ValueAxisError();	
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValues(){

		assertEquals(errorValueAxis.getId(),0);
		assertTrue(errorValueAxis.getLogBase()==0);
		assertTrue(errorValueAxis.getMaximum()==0);
		assertTrue(errorValueAxis.getMinimum()==0);
		assertEquals(errorValueAxis.getNumberFormat(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedenumValues(){
		assertEquals(errorValueAxis.getCrossBetween(),AxisCrossBetween.BETWEEN);
		assertEquals(errorValueAxis.getCrosses(),AxisCrosses.AUTO_ZERO);
		assertEquals(errorValueAxis.getOrientation(),AxisOrientation.MAX_MIN);
		assertEquals(errorValueAxis.getPosition(),AxisPosition.BOTTOM);
	}

	@Test
	public void whenCallAnyMethodWithReturnedStringValues(){
		assertEquals(errorValueAxis.getNumberFormat(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValues(){
		assertEquals(errorValueAxis.isSetLogBase(),false);
		assertEquals(errorValueAxis.isSetMaximum(),false);
		assertEquals(errorValueAxis.isSetMinimum(),false);
	}

}
