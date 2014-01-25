package excel.errors.model.iterators;

import static excel.errors.model.iterators.IteratorConstantsError.getFalse;

import java.util.Iterator;

import excel.errors.model.CellError;



public class CellteratorError<Cell> implements Iterator<Cell>{


	public boolean hasNext() {
		return getFalse();
	}


	@SuppressWarnings("unchecked")
	public Cell next() {
		
		return   (Cell) new CellError();
	}


	public void remove() {
		
	}
}
