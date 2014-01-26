package excel.exceptions.types;

import org.apache.poi.POIXMLException;
import org.apache.poi.poifs.filesystem.OfficeXmlFileException;

import excel.exceptions.PrinterException;
import excel.exceptions.factories.PrinterExceptionFactory;
import excel.exceptions.strategys.IgnoreExceptionCause;

public class ExceptionsTypes {
	
	private static PrinterExceptionFactory printerExdeptionFactory = new PrinterExceptionFactory();
	
	static public PrinterException ignoreCauseOfficeXmlFileExceptionAndPOIXMLException(Exception exception){
		return printerExdeptionFactory
				      .addStrategyIgnore(new IgnoreExceptionCause(OfficeXmlFileException.class))
				      .addStrategyIgnore(new IgnoreExceptionCause(POIXMLException.class))
				      .create(exception);
	}

}
