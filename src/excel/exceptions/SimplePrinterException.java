package excel.exceptions;

public class SimplePrinterException extends PrinterException{

	private static final long serialVersionUID = 1L;

	private Exception exception;
	
	public SimplePrinterException(Exception exception) {
	     this.exception = exception;
	}

	public void printStackTrace() {
		 exception.printStackTrace();		
	}

	public Exception getException() {
		return exception;
	}

}
