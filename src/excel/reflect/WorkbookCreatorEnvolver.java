package excel.reflect;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.poi.ss.usermodel.Workbook;

import excel.exceptions.PrinterException;

import static excel.exceptions.types.ExceptionsTypes.*;


public class WorkbookCreatorEnvolver {
	

	private Class <?> workBookClass ;
	
	public WorkbookCreatorEnvolver (Class <?>workBookClass){
		this.workBookClass = workBookClass;
	}
		
	public Workbook createWorkBook(InputStream stream) throws PrinterException{
		try {
			Constructor<?> constructor = workBookClass.getConstructor(InputStream.class);
			return (Workbook)constructor.newInstance(stream);
		} catch (SecurityException e) {
		    throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		} catch (NoSuchMethodException e) {
			throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		} catch (IllegalArgumentException e) {
			throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		} catch (InstantiationException e) {
			throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		} catch (IllegalAccessException e) {
			throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		} catch (InvocationTargetException e) {
			throw ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(e);
		}	
	}
}
