package test.excel.utils.transforms.output;

import static org.junit.Assert.*;
import static test.excel.commons.OperationsOutputStream.*;

import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import excel.utils.transforms.output.OutputStremToByteArrayInputStream;

public class OutputStremToByteArrayInputStreamTest {

	private OutputStremToByteArrayInputStream transform;
	
	@Before
	public void setUp(){
		transform = new OutputStremToByteArrayInputStream();
	}
	
	@Test
	public void whenCallGetInputStream(){
		assertTrue(transform.getInputStream(getOutputStream()) instanceof InputStream);
	}		
}
