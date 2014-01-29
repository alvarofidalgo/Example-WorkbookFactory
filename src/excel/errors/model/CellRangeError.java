package excel.errors.model;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;

import excel.errors.model.iterators.ErrorCellterator;

@SuppressWarnings("unchecked")
public class CellRangeError<C extends Cell> implements CellRange<C> {

	
 
	public C getCell(int arg0, int arg1) {
		
		return (C) new CellError();
	}

	
	public C[][] getCells() {

		CellError[][] resulArray = {}; 
		return (C[][]) resulArray;
	}

	
	public C[] getFlattenedCells() {
		CellError [] cArray = {};
		return (C[]) cArray;
	}

	
	public int getHeight() {
		
		return 0;
	}

	
	public String getReferenceText() {
		
		return "";
	}

	
	public C getTopLeftCell() {
		
		return (C) new CellError();
	}

	
	public int getWidth() {
		
		return 0;
	}

	

	public Iterator<C> iterator() {

		return (Iterator<C>) new ErrorCellterator<Cell>();
	}

	
	public int size() {
		
		return 0;
	}

}
