package excel.exceptions.strategys;

public class IgnoreExceptionCause implements IgnorableExceptions{

    private Class<?> exceptionCausedClass;
	
    public IgnoreExceptionCause(Class<?> exceptionCausedClass){
    	this.exceptionCausedClass = exceptionCausedClass;
    }
    
	public boolean isIgnorable(Exception exception) {
        Throwable causeException = exception.getCause();
        return causeException==null?false:isCausedExceptionEqualsConstructor(causeException.getClass());

	}
	
	private boolean isCausedExceptionEqualsConstructor(Class<?> classCauseException){
		return classCauseException.getName()
                .equals(exceptionCausedClass.getName()); 
	}
	
}
