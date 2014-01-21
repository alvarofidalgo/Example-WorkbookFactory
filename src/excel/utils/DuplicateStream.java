package excel.utils;

import java.io.InputStream;
import java.io.OutputStream;

import excel.utils.transforms.input.InputStreamToByteArrayOutputStream;
import excel.utils.transforms.output.OutputStremToByteArrayInputStream;


import static excel.utils.closer.Closer.*;

public class DuplicateStream {

	private InputStream inputStream;
	
	public DuplicateStream(InputStream inputStream){
		this.inputStream = inputStream;	
	}
	
	public InputStream cloneStream() {		
		OutputStream outputStream = getOutputStreamByInputStream();
	    InputStream inputStreamReturned = getInputStreamByOutputStream(outputStream);	
	    inputStream = getInputStreamByOutputStream(outputStream);
		closeOutpuStream(outputStream);
		return  inputStreamReturned;
	}
	
	private OutputStream getOutputStreamByInputStream(){
		return  new InputStreamToByteArrayOutputStream().getOutpuStream(inputStream);
	}
	
	private InputStream getInputStreamByOutputStream(OutputStream outputStream){
		return new OutputStremToByteArrayInputStream().getInputStream(outputStream);
	}
}
