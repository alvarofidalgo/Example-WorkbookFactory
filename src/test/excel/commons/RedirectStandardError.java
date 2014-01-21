package test.excel.commons;

import java.io.OutputStream;
import java.io.PrintStream;
import static test.excel.commons.OperationsOutputStream.*;

public class RedirectStandardError {
	
	private static OutputStream errContent = getOutputStream();
	
	static public void assignNewStandardError(){
		System.setOut(new PrintStream(errContent));
	}
	
	static public void refreshStandardError(){
		System.setOut(null);
	}
	
	static public String getResultError(){
		return errContent.toString();
	}
}
