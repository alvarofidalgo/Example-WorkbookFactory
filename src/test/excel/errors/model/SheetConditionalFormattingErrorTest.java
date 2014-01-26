package test.excel.errors.model;



import org.apache.poi.ss.usermodel.ConditionalFormatting;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.util.CellRangeAddress;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.SheetConditionalFormattingError;
import excel.errors.model.ConditionalFormattingError;
import excel.errors.model.ConditionalFormattingErrorRule;
import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SheetConditionalFormattingErrorTest {
	
	private SheetConditionalFormattingError errorSheetConditionalFormatting;
	
	@Before
	public void setUp(){
		errorSheetConditionalFormatting = new SheetConditionalFormattingError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorSheetConditionalFormatting.addConditionalFormatting((ConditionalFormatting) anyObject()),0);
		assertEquals(errorSheetConditionalFormatting.addConditionalFormatting((CellRangeAddress[])anyObject(), (ConditionalFormattingRule) anyObject()),0);
		assertEquals(errorSheetConditionalFormatting.addConditionalFormatting((CellRangeAddress[])anyObject(), (ConditionalFormattingRule[]) anyObject()),0);
		assertEquals(errorSheetConditionalFormatting.addConditionalFormatting((CellRangeAddress[])anyObject(), 
				                                                           (ConditionalFormattingRule) anyObject(),
				                                                           (ConditionalFormattingRule) anyObject()),0);
		assertEquals(errorSheetConditionalFormatting.getNumConditionalFormattings(),0);
		
		
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedConditionalFormattingRuleValue(){
	   assertThat(errorSheetConditionalFormatting.createConditionalFormattingRule(anyString()),instanceOf(ConditionalFormattingErrorRule.class));
	   assertThat(errorSheetConditionalFormatting.createConditionalFormattingRule(anyByte(), anyString()),instanceOf(ConditionalFormattingErrorRule.class));
	   assertThat(errorSheetConditionalFormatting.createConditionalFormattingRule(anyByte(), anyString(),anyString()),instanceOf(ConditionalFormattingErrorRule.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedConditionalFormattingValue(){
	   assertThat(errorSheetConditionalFormatting.getConditionalFormattingAt(anyInt()),instanceOf(ConditionalFormattingError.class));
	}
	
	

}
