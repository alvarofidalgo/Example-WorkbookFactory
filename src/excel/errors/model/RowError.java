package excel.errors.model;


import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import excel.errors.model.iterators.ErrorCellterator;

public class RowError implements Row {


	public Iterator<Cell> iterator() {
		
		return new ErrorCellterator<Cell>();
	}

	
	public Iterator<Cell> cellIterator() {
		
		return new ErrorCellterator<Cell>();
	}

	
	public Cell createCell(int arg0) {
		
		return new CellError();
	}

	
	public Cell createCell(int arg0, int arg1) {
		
		return new CellError();
	}

	
	public Cell getCell(int arg0) {
		
		return  new CellError();
	}

	
	public Cell getCell(int arg0, MissingCellPolicy arg1) {
		
		return  new CellError();
	}

	
	public short getFirstCellNum() {
		
		return 0;
	}

	
	public short getHeight() {
		
		return 0;
	}

	
	public float getHeightInPoints() {
		
		return 0;
	}

	
	public short getLastCellNum() {
		
		return 0;
	}

	
	public int getPhysicalNumberOfCells() {
		
		return 0;
	}

	
	public int getRowNum() {
		
		return 0;
	}

	
	public CellStyle getRowStyle() {
		
		return new CellStyleError();
	}

	
	public Sheet getSheet() {
		
		return new SheetError();
	}

	
	public boolean getZeroHeight() {
		
		return false;
	}

	
	public boolean isFormatted() {
		
		return false;
	}

	
	public void removeCell(Cell arg0) {
		

	}

	
	public void setHeight(short arg0) {
		

	}

	
	public void setHeightInPoints(float arg0) {
		

	}

	
	public void setRowNum(int arg0) {
		

	}

	
	public void setRowStyle(CellStyle arg0) {
		

	}

	
	public void setZeroHeight(boolean arg0) {
		

	}

}
