package test.excel.errors.model;

import org.apache.poi.ss.usermodel.CellStyle;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CellStyleError;
import excel.errors.model.ColorError;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CellStyleErrorTest {
	
	private CellStyle errorCellStyle;
	
	@Before
	public void setUp(){
		errorCellStyle = new CellStyleError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorCellStyle.getAlignment(),0);
		assertEquals(errorCellStyle.getBorderBottom(),0);
		assertEquals(errorCellStyle.getBorderLeft(),0);
		assertEquals(errorCellStyle.getBorderRight(),0);
		assertEquals(errorCellStyle.getBorderTop(),0);
		assertEquals(errorCellStyle.getBottomBorderColor(),0);
		assertEquals(errorCellStyle.getDataFormat(),0);
		assertEquals(errorCellStyle.getFillBackgroundColor(),0);
		assertEquals(errorCellStyle.getFillForegroundColor(),0);
		assertEquals(errorCellStyle.getFillPattern(),0);
		assertEquals(errorCellStyle.getFontIndex(),0);
		assertEquals(errorCellStyle.getIndention(),0);
		assertEquals(errorCellStyle.getIndex(),0);
		assertEquals(errorCellStyle.getLeftBorderColor(),0);
		assertEquals(errorCellStyle.getRightBorderColor(),0);
		assertEquals(errorCellStyle.getRotation(),0);
		assertEquals(errorCellStyle.getTopBorderColor(),0);
		assertEquals(errorCellStyle.getVerticalAlignment(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertEquals(errorCellStyle.getHidden(),false);
		assertEquals(errorCellStyle.getLocked(),true);
		assertEquals(errorCellStyle.getWrapText(),false);		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorCellStyle.getDataFormatString(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnNedColorValue(){
		assertThat(errorCellStyle.getFillBackgroundColorColor(),instanceOf(ColorError.class));
		assertThat(errorCellStyle.getFillForegroundColorColor(),instanceOf(ColorError.class));
	
		
	}
}
