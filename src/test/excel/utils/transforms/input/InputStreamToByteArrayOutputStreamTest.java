package test.excel.utils.transforms.input;

import static org.junit.Assert.*;
import static test.excel.commons.OperationsInputStream.*;

import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Before;
import org.junit.Test;

import excel.utils.transforms.input.InputStreamToByteArrayOutputStream;

public class InputStreamToByteArrayOutputStreamTest {
	
	private InputStreamToByteArrayOutputStream inputStreamToByteArrayOutputStream;
	private InputStream fileInputStream;
	
	@Before
	public void setUp(){
			fileInputStream = getInputStream(FILE_TEXT);
			inputStreamToByteArrayOutputStream = new InputStreamToByteArrayOutputStream();
	}
	
	@Test
	public void whenCallGetOutputStream(){
		assertTrue(inputStreamToByteArrayOutputStream.getOutpuStream(fileInputStream) instanceof OutputStream);
	}

}
