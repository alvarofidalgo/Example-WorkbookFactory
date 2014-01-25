package excel.errors.model;

import org.apache.poi.ss.usermodel.BorderFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.PatternFormatting;



public class ConditionalFormattingErrorRule implements
		ConditionalFormattingRule {

	
	public BorderFormatting createBorderFormatting() {
		
		return new BorderFormattingError();
	}

	
	public FontFormatting createFontFormatting() {
		
		return new FontFormattingError();
	}

	
	public PatternFormatting createPatternFormatting() {
		
		return new PatternFormattingError();
	}

	
	public BorderFormatting getBorderFormatting() {
		
		return new BorderFormattingError();
	}

	
	public byte getComparisonOperation() {
		
		return 0;
	}

	
	public byte getConditionType() {
		
		return 0;
	}

	
	public FontFormatting getFontFormatting() {
		
		return new FontFormattingError();
	}

	
	public String getFormula1() {
		
		return "";
	}

	
	public String getFormula2() {
		
		return "";
	}

	
	public PatternFormatting getPatternFormatting() {
		
		return new PatternFormattingError();
	}

}
