package excel.errors.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartDataSource;
import org.apache.poi.ss.usermodel.charts.ScatterChartData;
import org.apache.poi.ss.usermodel.charts.ScatterChartSerie;

public class ScatterChartDataError implements ScatterChartData {


	public void fillChart(Chart arg0, ChartAxis... arg1) {


	}


	public ScatterChartSerie addSerie(ChartDataSource<?> arg0,
			ChartDataSource<? extends Number> arg1) {

		return new ScatterChartSerieError();
	}

	public List<? extends ScatterChartSerie> getSeries() {
		return new ArrayList<ScatterChartSerie>();
	}

}
