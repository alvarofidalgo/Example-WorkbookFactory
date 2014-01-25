package test.excel.errors.model;

import static mocks.excel.ganeratevalues.any.AnyValues.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.apache.poi.ss.usermodel.CreationHelper;
import org.junit.Before;
import org.junit.Test;

import excel.errors.model.ClientAnchorError;
import excel.errors.model.CreationHelperError;
import excel.errors.model.DataFormatError;
import excel.errors.model.FormulaEvaluatorError;
import excel.errors.model.HyperlinkError;
import excel.errors.model.RichTextStringError;


public class CreationHelperErrorTest {
	
	private CreationHelper errorCreationHelper;
	
	
	@Before
	public void setUp(){
		errorCreationHelper = new CreationHelperError();
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedClientAnchorValue(){
	  assertThat(errorCreationHelper.createClientAnchor(),instanceOf(ClientAnchorError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedDataFormatValue(){
	  assertThat(errorCreationHelper.createDataFormat(),instanceOf(DataFormatError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedFormulaEvaluatorValue(){
	  assertThat(errorCreationHelper.createFormulaEvaluator(),instanceOf(FormulaEvaluatorError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedHyperlinkValue(){
	  assertThat(errorCreationHelper.createHyperlink(anyInt()),instanceOf(HyperlinkError.class));
	}
	
	@Test
	public void whenCallAnyMethodWithReturnedRichTextStringValue(){
	  assertThat(errorCreationHelper.createRichTextString(anyString()),instanceOf(RichTextStringError.class));
	}

}
