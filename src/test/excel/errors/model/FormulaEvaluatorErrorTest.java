package test.excel.errors.model;


import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.CellError;
import excel.errors.model.FormulaEvaluatorError;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;



public class FormulaEvaluatorErrorTest {
	
	private FormulaEvaluator errorformulaEvaluator;
	
	@Before
	public void setUp(){
		errorformulaEvaluator = new FormulaEvaluatorError();
		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorformulaEvaluator.evaluateFormulaCell(anyCell()),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellValueValue(){
		assertEquals(errorformulaEvaluator.evaluate(anyCell()).getStringValue(),"");
	}	
	
	@Test
	public void whenCallAnyMethodWithReturnedCellValue(){
		assertThat(errorformulaEvaluator.evaluateInCell(anyCell()),instanceOf(CellError.class));
	}	
	
	

}
