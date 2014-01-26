package test.excel.errors.model;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.junit.Before;
import org.junit.Test;


import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import excel.errors.model.ChartError;
import excel.errors.model.ClientAnchorError;
import excel.errors.model.CommentError;
import excel.errors.model.DrawingError;
import excel.errors.model.PictureError;

public class DrawingErrorTest {
	
	private DrawingError errorDrawing;
	
	@Before
	public void setUp(){
		errorDrawing = new DrawingError();
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedClientAnchorValue(){
		assertThat(errorDrawing.createAnchor(anyInt(), anyInt(), 
				anyInt(), anyInt(), anyInt(), anyInt(), anyInt(), anyInt()),instanceOf(ClientAnchorError.class));
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedCommentValue(){
		assertThat(errorDrawing.createCellComment((ClientAnchor) anyObject()),instanceOf(CommentError.class));
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedChartValue(){
		assertThat(errorDrawing.createChart((ClientAnchor) anyObject()),instanceOf(ChartError.class));
	}
	
	@Test
	public void whenCallMethodWithAnyReturnedPictureValue(){
		assertThat(errorDrawing.createPicture((ClientAnchor) anyObject(),anyInt()),instanceOf(PictureError.class));
	}

}
