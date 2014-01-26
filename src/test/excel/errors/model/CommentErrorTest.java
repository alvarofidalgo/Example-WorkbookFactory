package test.excel.errors.model;

import org.apache.poi.ss.usermodel.Comment;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CommentError;
import excel.errors.model.RichTextStringError;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CommentErrorTest {
	
	private Comment errorComent;
	
	@Before
	public void setUp(){
		errorComent = new CommentError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorComent.getColumn(),0);
		assertEquals(errorComent.getRow(),0);
	}

	@Test
	public void whenCallAnyMethodWithReturnedStringValue(){
		assertEquals(errorComent.getAuthor(),"");
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBooleanValue(){
		assertThat(errorComent.getString(),instanceOf(RichTextStringError.class));
	}

}
