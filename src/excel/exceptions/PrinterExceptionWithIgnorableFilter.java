package excel.exceptions;

import excel.exceptions.strategys.IgnorableExceptions;

public class PrinterExceptionWithIgnorableFilter extends PrinterException {

	private static final long serialVersionUID = 1L;

	private PrinterException personalPrinterException;
	private IgnorableExceptions strategyIgnore;
	
	
	public PrinterExceptionWithIgnorableFilter(PrinterException personalPrinterException,
			                                   IgnorableExceptions strategyIgnore) {
		this.personalPrinterException = personalPrinterException;
		this.strategyIgnore = strategyIgnore;
	}


	public void printStackTrace() {
		if (!strategyIgnore.isIgnorable(personalPrinterException.getException()))
		   personalPrinterException.printStackTrace();
	}



	public Exception getException() {

		return personalPrinterException.getException();
	}

}
