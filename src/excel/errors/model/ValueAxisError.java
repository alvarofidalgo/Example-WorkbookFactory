package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.AxisCrossBetween;
import org.apache.poi.ss.usermodel.charts.AxisCrosses;
import org.apache.poi.ss.usermodel.charts.AxisOrientation;
import org.apache.poi.ss.usermodel.charts.AxisPosition;
import org.apache.poi.ss.usermodel.charts.ChartAxis;
import org.apache.poi.ss.usermodel.charts.ValueAxis;

public class ValueAxisError implements ValueAxis {

	
	public void crossAxis(ChartAxis arg0) {
		

	}

	
	public AxisCrosses getCrosses() {
		
		return AxisCrosses.AUTO_ZERO;
	}

	
	public long getId() {
		
		return 0;
	}

	
	public double getLogBase() {
		
		return 0;
	}

	
	public double getMaximum() {
		
		return 0;
	}

	
	public double getMinimum() {
		
		return 0;
	}

	
	public String getNumberFormat() {
		
		return "";
	}

	
	public AxisOrientation getOrientation() {
		
		return AxisOrientation.MAX_MIN;
	}

	
	public AxisPosition getPosition() {
		
		return AxisPosition.BOTTOM;
	}

	
	public boolean isSetLogBase() {
		
		return false;
	}

	
	public boolean isSetMaximum() {
		
		return false;
	}

	
	public boolean isSetMinimum() {
		
		return false;
	}

	
	public void setCrosses(AxisCrosses arg0) {
		

	}

	
	public void setLogBase(double arg0) {
		

	}

	
	public void setMaximum(double arg0) {
		

	}

	
	public void setMinimum(double arg0) {
		

	}

	
	public void setNumberFormat(String arg0) {
		

	}

	
	public void setOrientation(AxisOrientation arg0) {
		

	}

	
	public void setPosition(AxisPosition arg0) {
		

	}

	
	public AxisCrossBetween getCrossBetween() {
		
		return AxisCrossBetween.BETWEEN;
	}

	
	public void setCrossBetween(AxisCrossBetween arg0) {
		

	}

}
