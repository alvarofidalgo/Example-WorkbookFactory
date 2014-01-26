package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ScatterChartSerie;

public class ScatterChartSerieError implements ScatterChartSerie {


	@SuppressWarnings("rawtypes")
	public ChartDataSource<?> getXValues() {
		
		return new ChartDataSourceError();
	}


	public ChartDataSource<? extends Number> getYValues() {

		return new ChartDataSourceError<Number>();
	}

}
