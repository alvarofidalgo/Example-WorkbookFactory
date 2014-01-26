package excel.errors.model.iterators;

import static excel.errors.model.iterators.ErrorIteratorConstants.*;

import java.util.Iterator;

import excel.errors.model.RowError;


public class ErrorRowIterator<Row> implements Iterator<Row>{


	public boolean hasNext() {

		return getFalse();
	}


	@SuppressWarnings("unchecked")
	public Row next() {

		return (Row) new RowError();
	}


	public void remove() {
		
	}
}
