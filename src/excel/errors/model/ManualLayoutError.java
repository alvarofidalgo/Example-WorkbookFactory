package excel.errors.model;

import org.apache.poi.ss.usermodel.charts.LayoutMode;
import org.apache.poi.ss.usermodel.charts.LayoutTarget;
import org.apache.poi.ss.usermodel.charts.ManualLayout;

public class ManualLayoutError implements ManualLayout {

	
	public LayoutMode getHeightMode() {
		
		return LayoutMode.EDGE;
	}

	
	public double getHeightRatio() {
		
		return 0;
	}

	
	public LayoutTarget getTarget() {
		
		return LayoutTarget.INNER;
	}

	
	public LayoutMode getWidthMode() {
		
		return LayoutMode.EDGE;
	}

	
	public double getWidthRatio() {
		
		return 0;
	}

	
	public double getX() {
		
		return 0;
	}

	
	public LayoutMode getXMode() {
		
		return LayoutMode.EDGE;
	}

	
	public double getY() {
		
		return 0;
	}

	
	public LayoutMode getYMode() {
		
		return LayoutMode.EDGE;
	}

	
	public void setHeightMode(LayoutMode arg0) {
		

	}

	
	public void setHeightRatio(double arg0) {
		

	}

	
	public void setTarget(LayoutTarget arg0) {
		

	}

	
	public void setWidthMode(LayoutMode arg0) {
		

	}

	
	public void setWidthRatio(double arg0) {
		

	}

	
	public void setX(double arg0) {
		

	}

	
	public void setXMode(LayoutMode arg0) {
		

	}

	
	public void setY(double arg0) {
		

	}

	
	public void setYMode(LayoutMode arg0) {
		

	}

}
