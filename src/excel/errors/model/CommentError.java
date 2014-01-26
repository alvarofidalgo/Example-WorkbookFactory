package excel.errors.model;

import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.RichTextString;

public class CommentError implements Comment {

	
	public String getAuthor() {
		
		return "";
	}

	
	public int getColumn() {
		
		return 0;
	}

	
	public int getRow() {
		
		return 0;
	}

	
	public RichTextString getString() {
		
		return new RichTextStringError();
	}

	
	public boolean isVisible() {
		
		return false;
	}

	
	public void setAuthor(String arg0) {
		

	}

	
	public void setColumn(int arg0) {
		

	}

	
	public void setRow(int arg0) {
		

	}

	
	public void setString(RichTextString arg0) {
		

	}

	
	public void setVisible(boolean arg0) {
		

	}

}
