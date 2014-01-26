package excel.errors.model;

import java.util.Iterator;

import org.apache.poi.hssf.util.PaneInformation;
import org.apache.poi.ss.usermodel.AutoFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellRange;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Footer;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.PrintSetup;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;

import excel.errors.model.iterators.ErrorRowIterator;


public class SheetError implements Sheet {

	
	public Iterator<Row> iterator() {
		
		return new ErrorRowIterator<Row>();
	}

	
	public int addMergedRegion(CellRangeAddress arg0) {
		
		return 0;
	}

	
	public void addValidationData(DataValidation arg0) {
		

	}

	
	public void autoSizeColumn(int arg0) {
		

	}

	
	public void autoSizeColumn(int arg0, boolean arg1) {
		

	}

	
	public Drawing createDrawingPatriarch() {		
		return new DrawingError();
	}

	
	public void createFreezePane(int arg0, int arg1) {
		

	}

	
	public void createFreezePane(int arg0, int arg1, int arg2, int arg3) {
		

	}

	
	public Row createRow(int arg0) {
		
		return new RowError();
	}

	
	public void createSplitPane(int arg0, int arg1, int arg2, int arg3, int arg4) {
		

	}

	
	public boolean getAutobreaks() {
		
		return false;
	}

	
	public Comment getCellComment(int arg0, int arg1) {
		
		return new CommentError();
	}

	
	public int[] getColumnBreaks() {
		int [] returlArray= {};		
		return  returlArray;
	}

	
	public CellStyle getColumnStyle(int arg0) {
		
		return new CellStyleError();
	}

	
	public int getColumnWidth(int arg0) {
		
		return 0;
	}

	
	public DataValidationHelper getDataValidationHelper() {
		
		return new DataValidationHelperError();
	}

	
	public int getDefaultColumnWidth() {
		
		return 0;
	}

	
	public short getDefaultRowHeight() {
		
		return 0;
	}

	
	public float getDefaultRowHeightInPoints() {
		
		return 0;
	}

	
	public boolean getDisplayGuts() {
		
		return false;
	}

	
	public int getFirstRowNum() {
		
		return 0;
	}

	
	public boolean getFitToPage() {
		
		return false;
	}

	
	public Footer getFooter() {
		
		return new FooterError();
	}

	
	public boolean getForceFormulaRecalculation() {
		
		return false;
	}

	
	public Header getHeader() {
		
		return new HeaderError();
	}

	
	public boolean getHorizontallyCenter() {
		
		return false;
	}

	
	public int getLastRowNum() {
		
		return 0;
	}

	
	public short getLeftCol() {
		
		return 0;
	}

	
	public double getMargin(short arg0) {
		
		return 0;
	}

	
	public CellRangeAddress getMergedRegion(int arg0) {
		
		return new CellRangeAddress(0, 0, 0, 0);
	}

	
	public int getNumMergedRegions() {
		
		return 0;
	}

	
	public PaneInformation getPaneInformation() {
		
		return new PaneInformation((short)0, (short)0, (short)0, (byte)0, (byte) 0, false);
	}

	
	public int getPhysicalNumberOfRows() {
		
		return 0;
	}

	
	public PrintSetup getPrintSetup() {
		
		return new PrintSetupError();
	}

	
	public boolean getProtect() {
		
		return false;
	}

	
	public Row getRow(int arg0) {
		
		return new RowError();
	}

	
	public int[] getRowBreaks() {
		
		int [] returlArray= {};		
		return  returlArray;
	}

	
	public boolean getRowSumsBelow() {
		
		return false;
	}

	
	public boolean getRowSumsRight() {
		
		return false;
	}

	
	public boolean getScenarioProtect() {
		
		return false;
	}

	
	public SheetConditionalFormatting getSheetConditionalFormatting() {
		
		return new SheetConditionalFormattingError();
	}

	
	public String getSheetName() {
		
		return "";
	}

	
	public short getTopRow() {
		
		return 0;
	}

	
	public boolean getVerticallyCenter() {
		
		return false;
	}

	
	public Workbook getWorkbook() {
		
		return new WorkbookError();
	}

	
	public void groupColumn(int arg0, int arg1) {
		

	}

	
	public void groupRow(int arg0, int arg1) {
		

	}

	
	public boolean isColumnBroken(int arg0) {
		
		return false;
	}

	
	public boolean isColumnHidden(int arg0) {
		
		return false;
	}

	
	public boolean isDisplayFormulas() {
		
		return false;
	}

	
	public boolean isDisplayGridlines() {
		
		return false;
	}

	
	public boolean isDisplayRowColHeadings() {
		
		return false;
	}

	
	public boolean isDisplayZeros() {
		
		return false;
	}

	
	public boolean isPrintGridlines() {
		
		return false;
	}

	
	public boolean isRightToLeft() {
		
		return false;
	}

	
	public boolean isRowBroken(int arg0) {
		
		return false;
	}

	
	public boolean isSelected() {
		
		return false;
	}

	
	public void protectSheet(String arg0) {
		

	}

	
	public CellRange<? extends Cell> removeArrayFormula(Cell arg0) {
		
		return new CellRangeError<CellError>();
	}

	
	public void removeColumnBreak(int arg0) {
		

	}

	
	public void removeMergedRegion(int arg0) {
		

	}

	
	public void removeRow(Row arg0) {
		

	}

	
	public void removeRowBreak(int arg0) {
		

	}

	
	public Iterator<Row> rowIterator() {
		
		return new ErrorRowIterator<Row>();
	}

	
	public CellRange<? extends Cell> setArrayFormula(String arg0,
			CellRangeAddress arg1) {
		
		return new CellRangeError<Cell>();
	}

	
	public AutoFilter setAutoFilter(CellRangeAddress arg0) {
		
		return new AutoFilterError();
	}

	
	public void setAutobreaks(boolean arg0) {
		

	}

	
	public void setColumnBreak(int arg0) {
		

	}

	
	public void setColumnGroupCollapsed(int arg0, boolean arg1) {
		

	}

	
	public void setColumnHidden(int arg0, boolean arg1) {
		

	}

	
	public void setColumnWidth(int arg0, int arg1) {
		

	}

	
	public void setDefaultColumnStyle(int arg0, CellStyle arg1) {
		

	}

	
	public void setDefaultColumnWidth(int arg0) {
		

	}

	
	public void setDefaultRowHeight(short arg0) {
		

	}

	
	public void setDefaultRowHeightInPoints(float arg0) {
		

	}

	
	public void setDisplayFormulas(boolean arg0) {
		

	}

	
	public void setDisplayGridlines(boolean arg0) {
		

	}

	
	public void setDisplayGuts(boolean arg0) {
		

	}

	
	public void setDisplayRowColHeadings(boolean arg0) {
		

	}

	
	public void setDisplayZeros(boolean arg0) {
		

	}

	
	public void setFitToPage(boolean arg0) {
		

	}

	
	public void setForceFormulaRecalculation(boolean arg0) {
		

	}

	
	public void setHorizontallyCenter(boolean arg0) {
		

	}

	
	public void setMargin(short arg0, double arg1) {
		

	}

	
	public void setPrintGridlines(boolean arg0) {
		

	}

	
	public void setRightToLeft(boolean arg0) {
		

	}

	
	public void setRowBreak(int arg0) {
		

	}

	
	public void setRowGroupCollapsed(int arg0, boolean arg1) {
		

	}

	
	public void setRowSumsBelow(boolean arg0) {
		

	}

	
	public void setRowSumsRight(boolean arg0) {
		

	}

	
	public void setSelected(boolean arg0) {
		

	}

	
	public void setVerticallyCenter(boolean arg0) {
		

	}

	
	public void setZoom(int arg0, int arg1) {
		

	}

	
	public void shiftRows(int arg0, int arg1, int arg2) {
		

	}

	
	public void shiftRows(int arg0, int arg1, int arg2, boolean arg3,
			boolean arg4) {
		

	}

	
	public void showInPane(short arg0, short arg1) {
		

	}

	
	public void ungroupColumn(int arg0, int arg1) {
		

	}

	
	public void ungroupRow(int arg0, int arg1) {
		

	}

}
