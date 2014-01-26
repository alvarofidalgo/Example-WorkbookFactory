package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ClientAnchorError;
import excel.errors.model.PictureDataError;
import excel.errors.model.PictureError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PictureErrorTest {
	
	private PictureError errorPicture;
	
	@Before
	public void setUp(){
		errorPicture = new PictureError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedPictureDataValue(){
		assertThat(errorPicture.getPictureData(),instanceOf(PictureDataError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedClientAnchorValue(){
		assertThat(errorPicture.getPreferredSize(),instanceOf(ClientAnchorError.class));
	}

}
