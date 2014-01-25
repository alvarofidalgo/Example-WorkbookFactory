package test.excel.errors.model;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ClientAnchorError;
import static org.junit.Assert.*;

public class ClientAnchorErrorTest {
	
	private ClientAnchor errorClientAnchor;
	
	@Before
	public void setUp(){
		errorClientAnchor = new ClientAnchorError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorClientAnchor.getAnchorType(),0);
		assertEquals(errorClientAnchor.getAnchorType(),0);
		assertEquals(errorClientAnchor.getCol1(),0);
		assertEquals(errorClientAnchor.getCol2(),0);
		assertEquals(errorClientAnchor.getDx1(),0);
		assertEquals(errorClientAnchor.getDx2(),0);
		assertEquals(errorClientAnchor.getDy1(),0);
		assertEquals(errorClientAnchor.getDy2(),0);
		assertEquals(errorClientAnchor.getRow1(),0);
		assertEquals(errorClientAnchor.getRow2(),0);
	}

}
