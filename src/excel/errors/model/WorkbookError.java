package excel.errors.model;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class WorkbookError implements Workbook{

	
	public int addPicture(byte[] arg0, int arg1) {		
		return -1;
	}

	
	public void addToolPack(UDFFinder arg0) {
			
	}

	
	public Sheet cloneSheet(int arg0) {
		
		return new SheetError();
	}

	
	public CellStyle createCellStyle() {
		
		return new CellStyleError();
	}

	
	public DataFormat createDataFormat() {
		
		return new DataFormatError();
	}

	
	public Font createFont() {
		
		return new FontError();
	}

	
	public Name createName() {		
		return new NameError();
	}

	
	public Sheet createSheet() {		
		return new SheetError();
	}

	
	public Sheet createSheet(String arg0) {
		
		return new SheetError();
	}

	
	public Font findFont(short arg0, short arg1, short arg2, String arg3,
			boolean arg4, boolean arg5, short arg6, byte arg7) {
		
		return new FontError();
	}

	
	public int getActiveSheetIndex() {
		
		return -1;
	}

	
	public List<? extends PictureData> getAllPictures() {
		
		return new ArrayList<PictureData>();
	}

	
	public CellStyle getCellStyleAt(short arg0) {
		
		return new CellStyleError();
	}

	
	public CreationHelper getCreationHelper() {
		
		return new CreationHelperError();
	}

	
	public int getFirstVisibleTab() {
		
		return -1;
	}

	
	public Font getFontAt(short arg0) {
		
		return new FontError();
	}

	
	public boolean getForceFormulaRecalculation() {
		
		return false;
	}

	

	public MissingCellPolicy getMissingCellPolicy() {
		
		return Row.CREATE_NULL_AS_BLANK;
	}

	
	public Name getName(String arg0) {
		
		return new NameError();
	}

	
	public Name getNameAt(int arg0) {
		
		return new NameError();
	}

	
	public int getNameIndex(String arg0) {
		
		return -1;
	}

	
	public short getNumCellStyles() {
		
		return 0;
	}

	
	public short getNumberOfFonts() {
		
		return 0;
	}

	
	public int getNumberOfNames() {
		
		return 0;
	}

	
	public int getNumberOfSheets() {
		
		return 0;
	}

	
	public String getPrintArea(int arg0) {
		
		return "";
	}


	public Sheet getSheet(String arg0) {
		
		return new SheetError();
	}


	public Sheet getSheetAt(int arg0) {
		
		return new SheetError();
	}


	public int getSheetIndex(String arg0) {

		return -1;
	}


	public int getSheetIndex(Sheet arg0) {
		
		return -1;
	}

	
	public String getSheetName(int arg0) {
		
		return "";
	}

	
	public boolean isHidden() {
		
		return false;
	}

	
	public boolean isSheetHidden(int arg0) {
		
		return false;
	}

	
	public boolean isSheetVeryHidden(int arg0) {
		
		return false;
	}

	
	public void removeName(int arg0) {
		
		
	}

	
	public void removeName(String arg0) {
		
		
	}

	
	public void removePrintArea(int arg0) {
		
		
	}

	
	public void removeSheetAt(int arg0) {
		
		
	}

	
	public void setActiveSheet(int arg0) {
		
		
	}

	
	public void setFirstVisibleTab(int arg0) {
		
		
	}

	
	public void setForceFormulaRecalculation(boolean arg0) {
		
		
	}

	
	public void setHidden(boolean arg0) {
		
		
	}

	
	public void setMissingCellPolicy(MissingCellPolicy arg0) {
		
		
	}

	
	public void setPrintArea(int arg0, String arg1) {
		
		
	}

	
	public void setPrintArea(int arg0, int arg1, int arg2, int arg3, int arg4) {
		
		
	}

	
	public void setRepeatingRowsAndColumns(int arg0, int arg1, int arg2,
			int arg3, int arg4) {
		
		
	}

	
	public void setSelectedTab(int arg0) {
		
		
	}

	
	public void setSheetHidden(int arg0, boolean arg1) {
		
		
	}

	
	public void setSheetHidden(int arg0, int arg1) {
		
		
	}

	
	public void setSheetName(int arg0, String arg1) {
		
		
	}

	
	public void setSheetOrder(String arg0, int arg1) {
		
		
	}

	
	public void write(OutputStream arg0) throws IOException {
		
		
	}

}
