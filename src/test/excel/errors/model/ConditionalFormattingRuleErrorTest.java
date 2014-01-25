package test.excel.errors.model;

import org.junit.Before;
import org.junit.Test;

import excel.errors.model.BorderFormattingError;
import excel.errors.model.ConditionalFormattingErrorRule;
import excel.errors.model.FontFormattingError;
import excel.errors.model.PatternFormattingError;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ConditionalFormattingRuleErrorTest {
	
	private ConditionalFormattingErrorRule errorConditionalFormattingRule;
	
	
	@Before
	public void setUp(){
		errorConditionalFormattingRule = new ConditionalFormattingErrorRule();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedBorderFormattingMethod(){
		assertThat(errorConditionalFormattingRule.createBorderFormatting(),instanceOf(BorderFormattingError.class));
		assertThat(errorConditionalFormattingRule.getBorderFormatting(),instanceOf(BorderFormattingError.class));

	}
	
	@Test
	public void whenCallAnyMethodWithReturnedFontFormattingMethod(){

		assertThat(errorConditionalFormattingRule.createFontFormatting(),instanceOf(FontFormattingError.class));
		assertThat(errorConditionalFormattingRule.getFontFormatting(),instanceOf(FontFormattingError.class));

	}
	
	@Test
	public void whenCallAnyMethodWithReturnedPatternFormattingMethod(){

		assertThat(errorConditionalFormattingRule.createPatternFormatting(),instanceOf(PatternFormattingError.class));
		assertThat(errorConditionalFormattingRule.getPatternFormatting(),instanceOf(PatternFormattingError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedNumericMethod(){

		assertEquals(errorConditionalFormattingRule.getComparisonOperation(),0);
		assertEquals(errorConditionalFormattingRule.getConditionType(),0);
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedStringMethod(){

		assertEquals(errorConditionalFormattingRule.getFormula1(),"");
		assertEquals(errorConditionalFormattingRule.getFormula1(),"");
	}

}
