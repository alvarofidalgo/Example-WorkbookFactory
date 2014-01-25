package test.excel.commons;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import static test.excel.commons.OperationsOutputStream.*;


public class RedirectStandardError {
	
	private static OutputStream errContent = getOutputStream();
	
	static public void assignNewStandardError(){
		try {
		  errContent.flush();
		  
		  System.setErr(new PrintStream(errContent));
		  
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	static public void refreshStandardError(){
		System.setErr(null);
	}
	
	static public String getResultError(){
		return errContent.toString();
	}
}
