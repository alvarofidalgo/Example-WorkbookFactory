package test.excel.commons;


import java.io.OutputStream;
import java.io.PrintStream;
import static test.excel.commons.OperationsOutputStream.*;

public class RedirecStandardOutput {
	
	private static OutputStream outContent = getOutputStream();
	
	static public void assignNewStandardOutput(){
		System.setOut(new PrintStream(outContent));
	}
	
	static public void refreshStandardOutput(){
		System.setOut(null);
	}
	
	static public String getResultOutput(){
		return outContent.toString();
	}

}
