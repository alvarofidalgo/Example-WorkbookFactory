package test.excel.utils.transforms.input;

import static excel.utils.transforms.input.InputStreamCopyOutputStream.*;
import static org.junit.Assert.*;
import static test.excel.commons.OperationsInputStream.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Test;

public class InputStreamCopyOutputStreamTest {
	
	private InputStream inputStream;
	
	@Before
	public void setUp() throws FileNotFoundException{
		  inputStream = getInputStream(FILE_TEXT);
	}
	
	@Test
	public void whenCallcopyToByteOutput() throws IOException{
		ByteArrayOutputStream byteOupPut = new ByteArrayOutputStream();
		copyInputStreamToOutputStream(inputStream,byteOupPut);
		assertEquals(numBytesInputStream(new ByteArrayInputStream(byteOupPut.toByteArray())),
				     numBytesInputStream(getInputStream(FILE_TEXT)));		
	}
}
