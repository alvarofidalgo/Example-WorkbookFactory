package test.excel.utils;

import static org.junit.Assert.*;
import static test.excel.commons.OperationsInputStream.*;

import org.junit.Before;
import org.junit.Test;
import excel.utils.DuplicateStream;

public class DuplicateStreamTest {
	
	private DuplicateStream duplicateStream;
	
	@Before
	public void setUp(){
			duplicateStream = new DuplicateStream(getInputStream(FILE_TEXT));
	}
	
	@Test
	public void whenCallCloneStream(){
		try {	
			assertEquals(numBytesInputStream(duplicateStream.cloneStream()),
					     numBytesInputStream(duplicateStream.cloneStream()));
		} catch (Exception e) {			
			fail(""+e.toString());			
		}
	}
}
