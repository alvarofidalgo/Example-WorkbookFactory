package test.excel.commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class OperationsInputStream {
	
	static public  final String FILE_TEXT="/test/excel/commonfiles/texto.txt";
	
	static public InputStream getInputStream(String type){
		return FileInputStream.class.getResourceAsStream(type);
		
	}
	
	static public int numBytesInputStream(InputStream inputStream) throws IOException{
		int read = 0;
		int sum = 0;
		while ((read = inputStream.read()) != -1)
			sum = sum + read;
		inputStream.close();
		return sum;
	}

}
