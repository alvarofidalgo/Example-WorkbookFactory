package excel.errors.model;

import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;

public class SheetConditionalFormattingError implements
		SheetConditionalFormatting {

	
	public int addConditionalFormatting(ConditionalFormatting arg0) {
		
		return 0;
	}

	
	public int addConditionalFormatting(CellRangeAddress[] arg0,
			ConditionalFormattingRule arg1) {
		
		return 0;
	}

	
	public int addConditionalFormatting(CellRangeAddress[] arg0,
			ConditionalFormattingRule[] arg1) {
		
		return 0;
	}

	
	public int addConditionalFormatting(CellRangeAddress[] arg0,
			ConditionalFormattingRule arg1, ConditionalFormattingRule arg2) {
		
		return 0;
	}

	
	public ConditionalFormattingRule createConditionalFormattingRule(String arg0) {
		
		return new ConditionalFormattingErrorRule();
	}

	
	public ConditionalFormattingRule createConditionalFormattingRule(byte arg0,
			String arg1) {
		
		return new ConditionalFormattingErrorRule();
	}

	
	public ConditionalFormattingRule createConditionalFormattingRule(byte arg0,
			String arg1, String arg2) {
		
		return new ConditionalFormattingErrorRule();
	}

	
	public ConditionalFormatting getConditionalFormattingAt(int arg0) {
		
		return new ConditionalFormattingError();
	}

	
	public int getNumConditionalFormattings() {
		
		return 0;
	}

	
	public void removeConditionalFormatting(int arg0) {
		

	}

}
