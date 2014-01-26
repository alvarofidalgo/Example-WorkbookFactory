package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.ChartDataFactory;
import org.apache.poi.ss.usermodel.charts.ScatterChartData;

public class ChartDataFactoryError implements ChartDataFactory {


	public ScatterChartData createScatterChartData() {

		return new ScatterChartDataError();
	}

}
