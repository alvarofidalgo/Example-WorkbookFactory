package excel.errors.model;


import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;

import org.apache.poi.ss.util.CellRangeAddress;

public class ConditionalFormattingError implements ConditionalFormatting {

	
	public void addRule(ConditionalFormattingRule arg0) {
			
	}

	
	public CellRangeAddress[] getFormattingRanges() {
		CellRangeAddress[] returnedCellRangeAddreds= {};
		return returnedCellRangeAddreds;
	}

	
	public int getNumberOfRules() {
		
		return 0;
	}

	
	public ConditionalFormattingRule getRule(int arg0) {
		
		return new ConditionalFormattingErrorRule();
	}

	
	public void setRule(int arg0, ConditionalFormattingRule arg1) {
		
		
	}
}
