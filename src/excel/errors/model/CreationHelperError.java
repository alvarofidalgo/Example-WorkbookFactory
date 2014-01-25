package excel.errors.model;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.RichTextString;

public class CreationHelperError implements CreationHelper {

	
	public ClientAnchor createClientAnchor() {
		
		return new ClientAnchorError();
	}

	
	public DataFormat createDataFormat() {
		
		return new DataFormatError();
	}

	
	public FormulaEvaluator createFormulaEvaluator() {
		
		return new FormulaEvaluatorError();
	}

	
	public Hyperlink createHyperlink(int arg0) {
		
		return new HyperlinkError();
	}

	
	public RichTextString createRichTextString(String arg0) {
		
		return new RichTextStringError();
	}

}
