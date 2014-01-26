package excel.exceptions.factories;

import java.util.ArrayList;
import java.util.List;

import excel.exceptions.PrinterException;
import excel.exceptions.PrinterExceptionWithIgnorableFilter;
import excel.exceptions.SimplePrinterException;
import excel.exceptions.strategys.IgnorableExceptions;

public class PrinterExceptionFactory {

	
	private List <IgnorableExceptions> listWithStrategyIgnrable = new ArrayList<IgnorableExceptions>();
	
	public PrinterException create(Exception exception) {
		PrinterException printerException= new SimplePrinterException(exception);
		for (IgnorableExceptions strategyIgnore : listWithStrategyIgnrable)
			printerException = new PrinterExceptionWithIgnorableFilter(printerException,strategyIgnore);
		return printerException;
	}
	
	public PrinterExceptionFactory addStrategyIgnore(IgnorableExceptions strategyIgnore){
		listWithStrategyIgnrable.add(strategyIgnore);
		return this;
	}

}
