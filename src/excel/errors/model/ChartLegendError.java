package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.ChartLegend;
import org.apache.poi.ss.usermodel.charts.LegendPosition;
import org.apache.poi.ss.usermodel.charts.ManualLayout;

public class ChartLegendError implements ChartLegend {


	public ManualLayout getManualLayout() {

		return new ManualLayoutError();
	}


	public LegendPosition getPosition() {

		return LegendPosition.BOTTOM;
	}


	public void setPosition(LegendPosition arg0) {

	}

}
