package test.excel.utils.closer;

import static excel.utils.closer.Closer.*;
import static org.junit.Assert.*;
import static test.excel.commons.RedirecStandardOutput.*;
import static test.excel.commons.RedirectStandardError.*;
import static test.excel.commons.OperationsOutputStream.*;

import java.io.OutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CloserTest {
		
	private OutputStream outputStream;
	
	
	@Before
	public void setUp(){		
		assignNewStandardOutput();
		assignNewStandardError();
		outputStream = getOutputStream();
	}
	
	@After
	public void shutDown(){
		refreshStandardOutput();
		refreshStandardError();
	}
	
	@Test
	public void whenCloseOutputStreamExceptionTraceShouldBeEmpty(){
	   closeOutpuStream(outputStream);
       assertTrue(getResultError().equals("")&&getResultOutput().toString().equals(""));
	}

}
