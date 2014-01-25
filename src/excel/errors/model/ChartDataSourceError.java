package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;

import excel.errors.lang.NumberError;

public class ChartDataSourceError<T> implements ChartDataSource<T> {


	public String getFormulaString() {

		return "";
	}


	
	@SuppressWarnings("unchecked")
	public T getPointAt(int arg0) {

		return  (T) new NumberError();
	}


	public int getPointCount() {

		return 0;
	}


	public boolean isNumeric() {

		return false;
	}


	public boolean isReference() {

		return false;
	}

}
