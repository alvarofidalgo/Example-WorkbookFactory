package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.ChartAxisFactory;
import org.apache.poi.ss.usermodel.charts.ValueAxis;

public class ChartAxisFactoryError implements ChartAxisFactory {


	public ValueAxis createValueAxis(AxisPosition arg0) {

		return new ValueAxisError();
	}

}
