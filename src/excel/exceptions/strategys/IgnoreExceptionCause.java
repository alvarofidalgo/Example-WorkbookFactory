package excel.exceptions.strategys;


public class IgnoreExceptionCause implements IgnorableExceptions{

    private Class<?> exceptionCausedClass;
	
    public IgnoreExceptionCause(Class<?> exceptionCausedClass){
    	this.exceptionCausedClass = exceptionCausedClass;
    }
    
	public boolean isIgnorable(Exception exception) {
        Throwable causeException = exception.getCause();
        return causeException==null?false:isCausedExceptionEqualsConstructor(causeException.getClass());
      /*  Class<?> classCauseException = causeException.getClass();
		return getNameClass(classCauseException.getName())
				                 .equals(getNameClass(exceptionCausedClass.getName()));*/
	}
	
	private boolean isCausedExceptionEqualsConstructor(Class<?> classCauseException){
		return getNameClass(classCauseException.getName())
                .equals(getNameClass(exceptionCausedClass.getName())); 
	}
	
	//TENGO QUE INVESTIGAR PARA PODER ELIMINAR ESTO QUE ES UN CHAPUZA INTEGRAL
	private String getNameClass(String longNameClass){
		String [] separateName = longNameClass.split("\\$");
		return separateName[0];
	}

}
