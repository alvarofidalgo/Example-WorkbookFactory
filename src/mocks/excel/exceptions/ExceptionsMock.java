package mocks.excel.exceptions;

import org.mockito.Mockito;

public class ExceptionsMock {
	
	private static Exception parentException;
	
	static public Exception getExceptionMockType(Class <?> classException){		
		Object exception=null;
	try{
		 exception = Mockito.mock(classException); 
	}catch(Exception e){
		e.printStackTrace();
	}
		return (Exception)assignPArentException((Exception)exception);
	}
	
	static public Exception getExceptionWithCausedException(Class <?> classParentException,Class <?> classCausedException){
		Exception localParentException = getExceptionMockType(classParentException); 	
		Mockito.when(localParentException.getCause()).thenReturn(getExceptionMockType(classCausedException));
		return assignPArentException(localParentException);
	}
	
	static public Exception getExceptionWithCausedRealException(Class <?> classParentException,Exception exceptionCause){
		Exception localParentException = getExceptionMockType(classParentException);	
		Mockito.when(localParentException.getCause()).thenReturn(exceptionCause);
		return assignPArentException(localParentException);
	}
	
	static public boolean verifiCallPrintStactTraceParameterTimes(int times){
		try{
			
			Mockito.verify(parentException,Mockito.times(times)).printStackTrace();	
			return true;
		}catch(Throwable exception){			
		    return false;
		}		
	}
	
	
	private static Exception assignPArentException(Exception localException){
		parentException = localException;
		return localException;
	}
}
