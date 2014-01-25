package excel.errors.model.iterators;

import static excel.errors.model.iterators.IteratorConstantsError.*;

import java.util.Iterator;

import excel.errors.model.RowError;


public class RowIteratorError<Row> implements Iterator<Row>{


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
