package excel.errors.model;

import org.apache.poi.ss.usermodel.FontFormatting;

public class FontFormattingError implements FontFormatting {

	
	public short getEscapementType() {
		
		return 0;
	}

	
	public short getFontColorIndex() {
		
		return 0;
	}

	
	public int getFontHeight() {
		
		return 0;
	}

	
	public short getUnderlineType() {
		
		return 0;
	}

	
	public boolean isBold() {
		
		return false;
	}

	
	public boolean isItalic() {
		
		return false;
	}

	
	public void resetFontStyle() {
		

	}

	
	public void setEscapementType(short arg0) {
		

	}

	
	public void setFontColorIndex(short arg0) {
		

	}

	
	public void setFontHeight(int arg0) {
		

	}

	
	public void setFontStyle(boolean arg0, boolean arg1) {
		

	}

	
	public void setUnderlineType(short arg0) {
		

	}

}
