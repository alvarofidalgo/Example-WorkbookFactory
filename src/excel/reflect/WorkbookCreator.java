package excel.reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.apache.poi.POIXMLException;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;
import org.apache.poi.ss.usermodel.Workbook;

import excel.errors.model.WorkbookError;

public class WorkbookCreator {
	
	private Workbook workBook = new WorkbookError();
	private Class <?>workBookClass;
 	
	public WorkbookCreator(Class <?>workBookClass){
		this.workBookClass = workBookClass;
	}
		
	public Workbook createWorkBookByReflection(InputStream stream){
		
		try {
	
			Constructor<?> constructor = workBookClass.getConstructor(InputStream.class);
			workBook =  (Workbook)constructor.newInstance(stream);
		} catch (SecurityException e) {
		    e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			if (!e.getCause().getClass().equals(OfficeXmlFileException.class) && 
			    !e.getCause().getClass().equals(POIXMLException.class))			
			    e.printStackTrace();
		}	
	 	return workBook;
	}

}
