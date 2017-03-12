package com.test.app.guava.strings;

import java.util.Arrays;

import com.google.common.base.CaseFormat;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class StringsExample {
	
	public void show() {
		StringsExample stringsExample = new StringsExample();
		stringsExample.joinerExample();
		stringsExample.splitterExample();				
		stringsExample.charMatcherExample();
		stringsExample.caseFormatExample();
	}
	
	private void joinerExample() {
		System.out.println(Joiner.on(",")
				.skipNulls()
				.join(Arrays.asList(1, 2, null, 3, 4, 5, null, 6, 7, null, 8, 9)));
	}
	
	private void splitterExample() {
		System.out.println(Splitter.on(',')
		         .trimResults()
		         .omitEmptyStrings()
		         .split("Splits, sequence, , into, string, components, and, makes, ,them, "
		         		+ "available, through, an, Iterator, which, may, be, lazily, evaluated."));
	}
	
	private void charMatcherExample() {
		String input = "---hello,,,";	 
	    String result = CharMatcher.is('-').trimLeadingFrom(input);	 
	    result = CharMatcher.is(',').trimTrailingFrom(input);
	    System.out.println(result);
	    result = CharMatcher.anyOf("-,").trimFrom(input);
	    System.out.println(result);	    
	    input = "apple-banana.";
	    result = CharMatcher.anyOf("-.").replaceFrom(input, '!');
	    System.out.println(result);
	    result = CharMatcher.is('-').replaceFrom(input, " and ");
	    System.out.println(result);
	}
	
	private void caseFormatExample() {
		String data = "test_data";
		System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, data));
		System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, data));
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, data));		
	}

}
