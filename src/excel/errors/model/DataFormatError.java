package excel.errors.model;

import org.apache.poi.ss.usermodel.DataFormat;

public class DataFormatError implements DataFormat {


	public short getFormat(String arg0) {
		return 0;
	}

	public String getFormat(short arg0) {

		return "";
	}

}
