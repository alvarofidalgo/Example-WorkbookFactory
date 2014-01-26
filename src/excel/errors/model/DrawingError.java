package excel.errors.model;

import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Picture;

public class DrawingError implements Drawing {


	public ClientAnchor createAnchor(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7) {

		return new ClientAnchorError();
	}


	public Comment createCellComment(ClientAnchor arg0) {

		return new CommentError();
	}


	public Chart createChart(ClientAnchor arg0) {

		return new ChartError();
	}


	public Picture createPicture(ClientAnchor arg0, int arg1) {

		return new PictureError();
	}

}
