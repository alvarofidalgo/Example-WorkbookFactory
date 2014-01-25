package excel.errors.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ChartAxisFactory;
import org.apache.poi.ss.usermodel.charts.ChartData;
import org.apache.poi.ss.usermodel.charts.ChartDataFactory;
import org.apache.poi.ss.usermodel.charts.ChartLegend;
import org.apache.poi.ss.usermodel.charts.ManualLayout;


public class ChartError implements Chart {

	
	public ManualLayout getManualLayout() {
		
		return new ManualLayoutError();
	}

	
	public void deleteLegend() {
		

	}

	
	public List<? extends ChartAxis> getAxis() {
		
		return new ArrayList<ChartAxis>();
	}

	
	public ChartAxisFactory getChartAxisFactory() {

		
		return new ChartAxisFactoryError();
	}

	
	public ChartDataFactory getChartDataFactory() {
		
		return new ChartDataFactoryError();
	}

	
	public ChartLegend getOrCreateLegend() {
		
		return new ChartLegendError();
	}

	
	public void plot(ChartData arg0, ChartAxis... arg1) {
		

	}

}
