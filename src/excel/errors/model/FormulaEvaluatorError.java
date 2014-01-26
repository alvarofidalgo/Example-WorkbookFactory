package excel.errors.model;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

public class FormulaEvaluatorError implements FormulaEvaluator {

	
	public void clearAllCachedResultValues() {
		

	}

	
	public CellValue evaluate(Cell arg0) {
		
		return new CellValue("");
	}

	
	public void evaluateAll() {
		

	}

	
	public int evaluateFormulaCell(Cell arg0) {
		
		return 0;
	}

	
	public Cell evaluateInCell(Cell arg0) {
		
		return new CellError();
	}

	
	public void notifyDeleteCell(Cell arg0) {
		

	}

	
	public void notifySetFormula(Cell arg0) {
		

	}

	
	public void notifyUpdateCell(Cell arg0) {
		

	}

}
