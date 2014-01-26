package excel.errors.model;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.PictureData;

public class PictureError implements Picture {


	public PictureData getPictureData() {

		return new PictureDataError();
	}


	public ClientAnchor getPreferredSize() {

		return new ClientAnchorError();
	}

	public void resize() {

	}


	public void resize(double arg0) {

	}

}
