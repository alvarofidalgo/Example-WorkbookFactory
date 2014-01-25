package test.excel.commons;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class OperationsOutputStream {
	
	static public OutputStream getOutputStream(){
		return new ByteArrayOutputStream();
	}

}
