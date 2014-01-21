package excel.utils.transforms.input;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import static excel.utils.transforms.input.InputStreamCopyOutputStream.*;

public class InputStreamToByteArrayOutputStream {

	public OutputStream getOutpuStream(InputStream inputStream) {
		ByteArrayOutputStream byteOuputStream = new ByteArrayOutputStream();
		copyInputStreamToOutputStream(inputStream,byteOuputStream);
		return byteOuputStream;
	}
}
