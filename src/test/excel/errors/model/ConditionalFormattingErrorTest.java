package test.excel.errors.model;


import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ConditionalFormattingError;
import excel.errors.model.ConditionalFormattingErrorRule;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ConditionalFormattingErrorTest {
	
	private ConditionalFormattingError errorConditionalFormatting;
	
	
	@Before
	public void setUp(){
		errorConditionalFormatting = new ConditionalFormattingError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedCellRangeAddressValue(){
		assertEquals(errorConditionalFormatting.getFormattingRanges().length,0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedConditionalFormattingRuleValue(){
		assertThat(errorConditionalFormatting.getRule(anyInt()),instanceOf(ConditionalFormattingErrorRule.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericValue(){
		assertEquals(errorConditionalFormatting.getNumberOfRules(),0);
	}
	
	

}
