package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.PictureDataError;

import static org.junit.Assert.*;

public class PictureDataErrorTest {
	
	private PictureDataError errorPictureData;
	
	
	@Before
	public void setUp(){
		errorPictureData = new PictureDataError();
	}
	
	@Test
	public void whenCallAnyMethodReturnedByteValue(){
		assertEquals(errorPictureData.getData().length,0);
	}
	
	@Test
	public void whenCallAnyMethodReturnedStringValue(){
		assertEquals(errorPictureData.getMimeType(),"");
		assertEquals(errorPictureData.suggestFileExtension(),"");
	}

}
