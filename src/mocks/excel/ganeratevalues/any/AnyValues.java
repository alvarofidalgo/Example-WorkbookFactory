package mocks.excel.ganeratevalues.any;

import org.apache.poi.ss.usermodel.Cell;

import excel.errors.model.CellError;

public class AnyValues {
	
	static public int anyInt(){
		return 1;
	}
	
	static public short anyShort(){
		return 0;
	}
	
	static public String anyString(){
		return "";		
	}
		
	static public byte [] anyByteArray(){
		byte [] arrByte = {};
		return arrByte;
	}
	
	static public Cell anyCell(){
		return new CellError();
	}
	
	static public Object anyObject(){
		return null;
	}
	
	static public boolean anyBoolean(){
		return false;
	}
	
	static public byte anyByte(){
		return 0;
	}
}
