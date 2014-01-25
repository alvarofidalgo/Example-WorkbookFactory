package excel.errors.model;

import java.util.Calendar;
import java.util.Date;

import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

public class CellError implements Cell {

	
	public CellError(){
		
	}
	
	public CellRangeAddress getArrayFormulaRange() {
		
		return  new CellRangeAddress(0, 0, 0, 0);
	}

	
	public boolean getBooleanCellValue() {
		
		return false;
	}

	
	public int getCachedFormulaResultType() {
		
		return 0;
	}

	
	public Comment getCellComment() {
		
		return new CommentError();
	}

	
	public String getCellFormula() {
		
		return "";
	}

	
	public CellStyle getCellStyle() {
		
		return new CellStyleError();
	}

	
	public int getCellType() {
		
		return Cell.CELL_TYPE_ERROR;
	}

	
	public int getColumnIndex() {
		
		return 0;
	}

	
	public Date getDateCellValue() {
		
		return new Date(0);
	}

	
	public byte getErrorCellValue() {
		
		return 0;
	}

	
	public Hyperlink getHyperlink() {
		
		return new HyperlinkError();
	}

	
	public double getNumericCellValue() {
		
		return 0;
	}

	
	public RichTextString getRichStringCellValue() {
		
		return new RichTextStringError();
	}

	
	public Row getRow() {
		
		return new RowError();
	}

	
	public int getRowIndex() {
		
		return -1;
	}

	
	public Sheet getSheet() {
		
		return new SheetError();
	}

	
	public String getStringCellValue() {
		
		return "";
	}

	
	public boolean isPartOfArrayFormulaGroup() {
		
		return false;
	}

	
	public void removeCellComment() {
		

	}

	
	public void setAsActiveCell() {
		

	}

	
	public void setCellComment(Comment arg0) {
		

	}

	
	public void setCellErrorValue(byte arg0) {
		

	}

	
	public void setCellFormula(String arg0) throws FormulaParseException {
		

	}

	
	public void setCellStyle(CellStyle arg0) {
		

	}

	
	public void setCellType(int arg0) {
		

	}

	
	public void setCellValue(double arg0) {
		

	}

	
	public void setCellValue(Date arg0) {
		

	}

	
	public void setCellValue(Calendar arg0) {
		

	}

	
	public void setCellValue(RichTextString arg0) {
		

	}

	
	public void setCellValue(String arg0) {
		

	}

	
	public void setCellValue(boolean arg0) {
		

	}

	
	public void setHyperlink(Hyperlink arg0) {
		

	}

}
