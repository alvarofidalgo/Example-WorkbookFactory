package excel.exceptions;

public abstract class PrinterException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public abstract void printStackTrace();
	public abstract Exception getException();

}
