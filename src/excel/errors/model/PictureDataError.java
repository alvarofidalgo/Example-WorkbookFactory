package excel.errors.model;

import org.apache.poi.ss.usermodel.PictureData;

public class PictureDataError implements PictureData {

	
	public byte[] getData() {
		byte [] returnBytes = {};
		return returnBytes;
	}

	
	public String getMimeType() {
		
		return "";
	}

	
	public String suggestFileExtension() {
		
		return "";
	}

}
