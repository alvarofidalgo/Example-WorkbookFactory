package test.excel.errors.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.BorderFormattingError;

public class BorderFormattingErrorTest {
	
	private BorderFormattingError errorBorderFormatting;
	
	
	@Before
	public void setUp(){
		errorBorderFormatting = new BorderFormattingError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValues(){
		assertEquals(errorBorderFormatting.getBorderBottom(),0);
		assertEquals(errorBorderFormatting.getBorderDiagonal(),0);
		assertEquals(errorBorderFormatting.getBorderLeft(),0);
		assertEquals(errorBorderFormatting.getBorderRight(),0);
		assertEquals(errorBorderFormatting.getBorderTop(),0);
		assertEquals(errorBorderFormatting.getBottomBorderColor(),0);
		assertEquals(errorBorderFormatting.getDiagonalBorderColor(),0);
		assertEquals(errorBorderFormatting.getLeftBorderColor(),0);
		assertEquals(errorBorderFormatting.getRightBorderColor(),0);
		assertEquals(errorBorderFormatting.getTopBorderColor(),0);
	}

}
