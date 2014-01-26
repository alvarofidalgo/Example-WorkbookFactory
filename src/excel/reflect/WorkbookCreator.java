package excel.reflect;

import java.io.InputStream;
import org.apache.poi.ss.usermodel.Workbook;

import excel.errors.model.WorkbookError;
import excel.exceptions.PrinterException;


public class WorkbookCreator {
	
	private Workbook workBook = new WorkbookError();
	private WorkbookCreatorEnvolver workbookCreatorEnvolver;
 	
	public WorkbookCreator(Class <?>workBookClass){
		this.workbookCreatorEnvolver = new WorkbookCreatorEnvolver(workBookClass);
	}
		
	public Workbook createWorkBookByReflection(InputStream stream){
		try {			
			workBook = 	workbookCreatorEnvolver.createWorkBook(stream);	
		} catch (PrinterException exception) {
			exception.printStackTrace();
		} 
	 	return workBook;

	}

}
